package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;


public class ProductDAO {
	
	public ProductDTO read(ProductDTO bag) {

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getName());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getPrice());
		ResultSet rs = null; // 메서드 안에서 선언된 변수는 모두 지역변수
		// 지역변수는 초기화를 해주어야한다
		ProductDTO bag2 = new ProductDTO();

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
			String sql = "select * from product where id = ?";
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
				String name = rs.getString(2); // melon
				String content = rs.getString(3); // melon
				String price = rs.getString(4); // melon
				System.out.println(id + " " + name + " " + content + " " + price);
				bag2.setId(id);
				bag2.setName(name);
				bag2.setContent(content);
				bag2.setPrice(price);;
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

	public ArrayList<ProductDTO> read() {
		
		// DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어주어야 한다
		ArrayList<ProductDTO> list = new ArrayList<>();
		ResultSet rs = null; // 메서드 안에서 선언된 변수는 모두 지역변수
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
			String sql = "select * from product";
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
			while (rs.next()) {
				ProductDTO bag2 = new ProductDTO();
				System.out.println("검색 결과가 있음");
				String id = rs.getString(1); // melon re.getString("id");
				String name = rs.getString(2); // melon
				String content = rs.getString(3); // melon
				String price = rs.getString(4); // melon
				System.out.println(id + " " + name + " " + content + " " + price);
				bag2.setId(rs.getString(1));
				bag2.setName(rs.getString(2));
				bag2.setContent(rs.getString(3));
				bag2.setPrice(rs.getString(4));
				list.add(bag2);
				System.out.println(list.size());
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
}
