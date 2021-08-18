package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOO {
	// 자바에서 db처리할 때는 DML중심으로 클래스를 만든다.
	// db연결할 때는 "db를 단위로 연결"한다.
	// db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블단위로 만든다.
	// 테이블(entity, 개체)
	// create(insert~into values)
	public int create(String id, String pw, String tel, String name) throws Exception {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		// 2. java에서 db로 연결:
		// 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		// 3. sql문을 만든다.
		String sql = "insert into member values (?, ?, ?, ?)";
		// String sql = "delete from member where id = 'win'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, tel);
		ps.setString(4, name);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);
		
		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;

	}// create end

	public int update(String id, String tel) throws Exception {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		// 2. java에서 db로 연결:
		// 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		// 3. sql문을 만든다.
		String sql = "update member set tel = ? where id= ?";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
	}// create end
	
	public int delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.icecream db연결 성공!!!");

		String sql = "delete from map where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);
		
		return result;

	}// delete end
	
	public String[] read (String id) throws Exception {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		// 2. java에서 db로 연결:
		// 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		// 3. sql문을 만든다.
		String sql = "select * from map where store = ?"; // 1
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 전송");
		//System.out.println(rs.next());
		String[] result = new String[4];
		// {"winter","winter", "winter", "winter"}
		if (rs.next()) {
			// 테이블에 검색 결과가 있다라는 얘기
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			System.out.println(id2 + " " + pw + " " + name + " " + tel);
			result[0] = id2;
			result[1] = pw;
			result[2] = name;
			result[3] = tel;
		}
		return result;
	}// create end
} // class end
