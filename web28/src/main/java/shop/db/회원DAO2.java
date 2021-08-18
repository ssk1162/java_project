package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

public class 회원DAO2 {

	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	// 중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	// 파라메터, parameter
	public int create(회원Bag bag) {
		// 매서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;"만들어 짐.(선언!)
		// 선언의 위치가 변수의 생존범위를 결정함.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; // 메서드 안에서 선언된 변수는 모두 지역변수
		// 지역변수는 초기화를 해주어야한다
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "insert into member values (?, ?, ?, ?)";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 생성 성공!!!");
//	      String url = "http://www.naver.com";
//	      URL u = new URL(url);
//	      String file = "c:/temp/test.txt";
//	      File file2 = new File(file);

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);

		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) { // 2~4단계
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");

			e.printStackTrace();

		}
		return result;
	}

	// 하나의 이름으로 메서드이름을 쓸 수 있다.
	// 입력값의 형태가 다양한 형태이어야 한다.
	// 다형성(오버로딩)
	public 회원Bag read(회원Bag bag) {

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		ResultSet rs = null; // 메서드 안에서 선언된 변수는 모두 지역변수
		// 지역변수는 초기화를 해주어야한다
		회원Bag bag2 = new 회원Bag();

		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member where id = ?";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
//	      String url = "http://www.naver.com";
//	      URL u = new URL(url);
//	      String file = "c:/temp/test.txt";
//	      File file2 = new File(file);

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // cud일때만 쓴다
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			// System.out.println("검색결과는 " + rs.next());
			if (rs.next()) {
				System.out.println("검색 결과가 있음");
				String id = rs.getString(1); // melon re.getString("id");
				String pw = rs.getString(2); // melon
				String name = rs.getString(3); // melon
				String tel = rs.getString(4); // melon
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
			} else {
				System.out.println("검색 결과가 없음");
			}

		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) { // 2~4단계
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");
			e.printStackTrace();

		}
		return bag2;
	}

	public ArrayList<회원Bag> read() {

		ResultSet rs = null; // 메서드 안에서 선언된 변수는 모두 지역변수
		// 지역변수는 초기화를 해주어야한다
		// 가방을 넣어줄 컨테이너를 하나 만들어주자
		// 자바파일에서 자동 import : 커멘드 + 쉬프트 + o
		ArrayList<회원Bag> list = new ArrayList<회원Bag>();

		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member";
			// String sql = "delete from member where id = 'win'";
			// PrepareStatment : sql을 나타내는 부품.
			// 부품을 램에 넣어놓은 주소만 잇으면 됨.
			// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
//	      String url = "http://www.naver.com";
//	      URL u = new URL(url);
//	      String file = "c:/temp/test.txt";
//	      File file2 = new File(file);

			// 4. sql문을 mysql로 전송한다.
			// result = ps.executeUpdate(); // cud일때만 쓴다
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			// System.out.println("검색결과는 " + rs.next());
			while (rs.next()) { // row개수만큼 반복하게 됨
				System.out.println("검색 결과가 있음");
				// 가방을 만들어서 table에서 하나의 row를 거내준다음 가방에 넣어야 한다
				회원Bag bag2 = new 회원Bag();
				
				String id = rs.getString(1); // melon re.getString("id");
				String pw = rs.getString(2); // melon
				String name = rs.getString(3); // melon
				String tel = rs.getString(4); // melon
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
				// 만들어진 가방을 컨테이너에 넣어주어야 한다
				list.add(bag2);
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러 >> 드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) { // 2~4단계
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");
			e.printStackTrace();

		}
		return list;
	}

	public int update(회원Bag bag) {

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			String sql = "update member set tel = ?, name = ? where id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);

		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");

			e.printStackTrace();
		}
		return result;
	}

	public int delete(회원Bag bag) {

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			String sql = "delete from member where id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);

		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");

			e.printStackTrace();
		}
		return result;
	}

} // class
