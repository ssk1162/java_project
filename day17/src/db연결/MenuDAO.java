package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MenuDAO {
	public int create(String flavor, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector?���? ?���?!!!");
		
		String url = "jdbc:mysql://localhost:3306/icecream";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db?���? ?���?!!!");
		
		String sql = "insert into menu values (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, flavor);
		ps.setString(2, tel);
		
		System.out.println("3. sql�? ?��?�� ?���?!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql�? ?��?�� ?��?��");
		System.out.println("SQL�? ?��?�� 개수 "  + result + "�?");
		return result;
		
		
	}//create end
	
} //class end
