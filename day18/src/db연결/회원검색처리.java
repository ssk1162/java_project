package db연결;

import javax.swing.JOptionPane;

public class 회원검색처리 {

	public static void main(String[] args) throws Exception {
		//String sql = "delete from member where id = 'apple'";
		String id = JOptionPane.showInputDialog("아이디 입력");
		
		MemberDAOO db = new MemberDAOO();
		db.read(id);
		String[] result = db.read(id);
		System.out.println("검색된 id는 " + result[0]);
		System.out.println("검색된 pw는 " + result[1]);
		System.out.println("검색된 name는 " + result[2]);
		System.out.println("검색된 tel는 " + result[3]);
		
		// l1 setText(result[0]);
		// b1.setText(result[1]);
	}

}
