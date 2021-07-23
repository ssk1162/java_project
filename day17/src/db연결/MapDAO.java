package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MapDAO {

	public int create(String store, String location, String tel, String time) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		String sql = "insert into map values (?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, store);
		ps.setString(2, location);
		ps.setString(3, tel);
		ps.setString(4, time);

		System.out.println("3. sql문 생성 성공!!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;

	}// create end

	public int delete(String store) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		String sql = "delete from map where store = ?"; // 1

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, store);

		System.out.println("3. sql문 생성 성공!!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
	}// create end

	public String[] read(String store) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. icecream db연결 성공!!!");

		String sql = "select * from map where store = ?"; // 1

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, store);

		System.out.println("3. sql문 생성 성공!!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 전송");
		String[] result = new String[4];
		
		if (rs.next()) {
			String store1 = rs.getString(1);
			String location = rs.getString(2);
			String tel = rs.getString(3);
			String time = rs.getString(4);
			System.out.println(store1 + "\n" + location + "\n" + tel + "\n" + time);
			result[0] = store1;
			result[1] = location;
			result[2] = tel;
			result[3] = time;
		}
		return result;
	}// create end
} // class end
