package db연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {
		//String sql = "delete from member where id = 'apple'";
		String id = JOptionPane.showInputDialog("아이디 입력");
		
		MemberDAOO db = new MemberDAOO();
		db.delete(id);
	}

}
