package db연결;

import java.sql.Connection; //꼭 java.sql로 import!
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class ReviewDAO {
	public int create(String reviewid, String goods, String date, String contents, String grade) throws Exception {
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream DB연결 성공!!!");

		// 3. SQL문을 만든다. (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "insert into review values (?,?,?,?,?)"; // 뭘 넣을지 모르므로 ?로(1번~4번)
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, reviewid);
		ps.setString(2, goods);
		ps.setString(3, date);
		ps.setString(4, contents);
		ps.setString(5, grade);
		
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println("SQL문 수행 개수 " + result + "개"); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!
		return result;

	}// create

	public int update(String reviewid, String contents) throws Exception {
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream DB연결 성공!!!");

		// 3. SQL문을 만든다. (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "update review set contents = ? where reviewid = ?"; //tel이 1번 물음표, id가 2번 ?
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, contents);
		ps.setString(2, reviewid);
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!
		return result;

	}// update

	public int delete(String id) throws Exception {
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream DB연결 성공!!!");

		// 3. SQL문을 만든다. (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "delete from review where reviewid = ?"; // 1번 1개
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;
		
	}// delete
}// class
