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

			String url = "jdbc:mysql://localhost:3306/BAIRBNB";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<searchBag> read(String title, String keyword) {

		ResultSet rs = null;
		ArrayList<searchBag> bag2 = new ArrayList<searchBag>();
		
		try {
			//if (rs.getString(1).contains(keyword))
			String sql = "select proid, pronam, proadd, protel, propic, proimg from product ";
			
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 생성 성공!!!");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			
			switch(title) {
			case "pronam" :
				while(rs.next()) {
					if (rs.getString(2).contains(keyword) ) {
						searchBag bag = new searchBag();
						bag.setProid(rs.getInt(1));
						bag.setPronam(rs.getString(2));
						bag.setProadd(rs.getString(3));
						bag.setProtel(rs.getString(4));
						bag.setPropic(rs.getInt(5));
						bag.setProimg(rs.getString(6));
						
						bag2.add(bag);

					}
				}
				break;
			}
			
		} catch (SQLException e) { // 2~4단계
			System.out.println("2~4번 에러 >> DB관련된 처리하다 에러발생함");
			e.printStackTrace();

		}
		return bag2;
	}

}
