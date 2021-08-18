package 클래스사용;

import javax.swing.JOptionPane;

public class 회원로그인처리 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력"); // 회원가입처리
		String tel = JOptionPane.showInputDialog("전호번호 입력"); // 회원가입처리
		
		MemberDB db = new MemberDB();
		//db.login(id, pw); // 로그인 처리
		db.create(id, pw, name, tel); // 회원가입처리
		//db.delete(id); // 탈퇴 처리
	}

}
