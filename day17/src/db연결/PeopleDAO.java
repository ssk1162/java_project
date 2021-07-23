package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PeopleDAO {
	// 자바에서 db처리할 때는 DML 중심으로 클래스를 만든다
	// db연결할 때는 "db를 단위로 연결"한다
	// db연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다
	// 테이블(entity)
	// create(insert~into values)
	public int create(String id, String pw, String name, String tel) throws Exception {// 3
		// 자바와 db연결하는 프로그램(JDBC)순서
		// 1.jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver"); // 2
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream"; // 1
		String username = "root";
		String password = "1234";
		// 3.sql문을 만든다
		// 4.sql문을 mysql서버로 전송한다
		Connection con = DriverManager.getConnection(url, username, password);
		// 커넥션 java.sql로
		System.out.println("2.icecream db연결 성공!!!");

		// 3.sql문을 만든다
		String sql = "insert into people values(?,?,?,?)";
		// String sql ="delete from member where id = 'win'";
		// String sql = "insert into member values('apple','apple','apple','011')";
		// String sql = "insert into member values('apple2','apple2','apple2','019')";
		// String sql ="delete from member where id = 'apple'";
		// PrepareStatmentL
		// 부품을 램에 넣어놓은 주소만 있으면 됨
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return
		PreparedStatement ps = con.prepareStatement(sql);// java.sql
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql문 생성 성공");

		// String url = "http://www.naver.com"; // 이게 인터넷주소라는걸 인식못함
		// 부품 URL u = new //부품 URL(url);
		// 부품 File file2 = new File(file);
		// String file = "c:/temp/test.txt"; // 파일주소라는걸 인식못함
		// 괄호안에 ""쓰지말기 에러
		// 4.sql문을 mysql로 전송한다
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공" + result + "개");
		return result;

	}// creat end

	public int update(String id, String pw, String name, String tel) throws Exception {// 3
		// 자바와 db연결하는 프로그램(JDBC)순서
		// 1.jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver"); // 2
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream"; // 1
		String username = "root";
		String password = "1234";
		// 3.sql문을 만든다
		// 4.sql문을 mysql서버로 전송한다
		Connection con = DriverManager.getConnection(url, username, password);
		// 커넥션 java.sql로
		System.out.println("2.icecream db연결 성공!!!");

		// 3.sql문을 만든다
		// String sql = "insert into member values('win','win','win','win')";
		// String sql ="delete from member where id = 'win'";
		// String sql = "insert into member values('apple','apple','apple','011')";
		// String sql = "insert into member values('apple2','apple2','apple2','019')";
		// String sql ="update from member where id = ? where tel = ?"; 에러
		String sql = "update people set tel = ? where id = ? and pw = ? and name = ?";
		// PrepareStatmentL
		// 부품을 램에 넣어놓은 주소만 있으면 됨
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return
		PreparedStatement ps = con.prepareStatement(sql);// java.sql
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql문 생성 성공");

		// String url = "http://www.naver.com"; // 이게 인터넷주소라는걸 인식못함
		// 부품 URL u = new //부품 URL(url);
		// 부품 File file2 = new File(file);
		// String file = "c:/temp/test.txt"; // 파일주소라는걸 인식못함
		// 괄호안에 ""쓰지말기 에러
		// 4.sql문을 mysql로 전송한다
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공");
		System.out.println(result);
		return result;

	}// creat end

	public int delete(String id, String pw) throws Exception {// 3
		// 자바와 db연결하는 프로그램(JDBC)순서
		// 1.jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver"); // 2
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 db로 연결:
		// 연결할 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream"; // 1
		String username = "root";
		String password = "1234";
		// 3.sql문을 만든다
		// 4.sql문을 mysql서버로 전송한다
		Connection con = DriverManager.getConnection(url, username, password);
		// 커넥션 java.sql로
		System.out.println("2.icecream db연결 성공!!!");

		// 3.sql문을 만든다
		// String sql = "insert into member values('win','win','win','win')";
		// String sql ="delete from member where id = 'win'";
		// String sql = "insert into member values('apple','apple','apple','011')";
		// String sql = "insert into member values('apple2','apple2','apple2','019')";
		String sql = " delete from people where id = ? and pw =?";
		// PrepareStatmentL
		// 부품을 램에 넣어놓은 주소만 있으면 됨
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return
		PreparedStatement ps = con.prepareStatement(sql);// java.sql
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3.sql문 생성 성공");

		// String url = "http://www.naver.com"; // 이게 인터넷주소라는걸 인식못함
		// 부품 URL u = new //부품 URL(url);
		// 부품 File file2 = new File(file);
		// String file = "c:/temp/test.txt"; // 파일주소라는걸 인식못함
		// 괄호안에 ""쓰지말기 에러
		// 4.sql문을 mysql로 전송한다
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공");
		System.out.println(result);
		return result;
	}// delete end

	public String[] read(String id, String pw) throws Exception {// 3
		
		Class.forName("com.mysql.jdbc.Driver"); // 2
		System.out.println("1.connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/icecream"; // 1
		String username = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.icecream db연결 성공!!!");
		String sql = "select * from people where id = ? and pw =?";
	
		PreparedStatement ps = con.prepareStatement(sql);// java.sql
		ps.setString(1, id);
		ps.setString(2, pw);
		
		System.out.println("3.sql문 생성 성공");
		ResultSet rs = ps.executeQuery(); // ★얘만다름
		System.out.println("4.sql문 전송 성공");
		
		String[] result = new String[4];
		if (rs.next()) {
		
			String id2 = rs.getString(1);
			String pw2 = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			System.out.println(id2 + " " + pw2 + " " + name + " " + tel);
			result[0] = id2;
			result[1] = pw2;
			result[2] = name;
			result[3] = tel;

		}
		return result;

	}// read end
	public String[] idcheck(String id) throws Exception {// 3
		
		Class.forName("com.mysql.jdbc.Driver"); // 2
		System.out.println("1.connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/icecream"; // 1
		String username = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.icecream db연결 성공!!!");
		String sql = "select * from people where id = ?";
	
		PreparedStatement ps = con.prepareStatement(sql);// java.sql
		ps.setString(1, id);
	
		System.out.println("3.sql문 생성 성공");
		ResultSet rs = ps.executeQuery(); // ★얘만다름
		System.out.println("4.sql문 전송 성공");
		
		String[] result = new String[4];
		if (rs.next()) {
		
			String id2 = rs.getString(1);
			System.out.println(id2 +" ");
			result[0] = id2;

		}
		return result;

	}// read end



}
