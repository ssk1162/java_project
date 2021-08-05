package search.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import search.dto.searchBag;

public class searchDAO {

	Connection con;

	public searchDAO() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/BAIRBNB?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public ArrayList<searchBag> read(String word) {

		ResultSet rs = null;
		ArrayList<searchBag> bag2 = new ArrayList<searchBag>();

		try {
			String sql = "select * from product where pronam like ? or proadd like ? or propk like ? or prowifi like ? or propet like ?or probk like ?";

			PreparedStatement ps = con.prepareStatement(sql);
			String words = "%" + word + "%";
			System.out.println("3. sql문 생성 성공!!!");
			
			ps.setString(1, words);
			ps.setString(2, words);
			ps.setString(3, words);
			ps.setString(4, words);
			ps.setString(5, words);
			ps.setString(6, words);
			
			System.out.println(ps);
			System.out.println(words);
			System.out.println(word);
			
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			
				while (rs.next()) {

						searchBag bag = new searchBag();
						bag.setProid(rs.getInt(1));
						bag.setPronam(rs.getString(2));
						bag.setProadd(rs.getString(3));
						bag.setProtel(rs.getString(4));
						bag.setProprice(rs.getInt(5));
						bag.setProimg(rs.getString(6));
						bag.setPropk(rs.getString(7));
						bag.setProwifi(rs.getString(8));
						bag.setPropet(rs.getString(9));
						bag.setProbk(rs.getString(10));

						bag2.add(bag);
						System.out.println(bag);

					}
										

		} catch (SQLException e) { // 2~4단계
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");
			e.printStackTrace();

		}
		return bag2;
	}
	

}