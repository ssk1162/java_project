package ui;

import javax.swing.JOptionPane;

import db.게시판DAO;
import dto.게시판Bag2;

public class 게시판정보UI {

	public static void main(String[] args) {
		
		// 1 게시판 정보 입력받아서
		// 2 가방을 만들어서 입력받은 데이터를 넣으세요
		// 3 dao를 만들어서 dao에게 create기능을 호출(가방을 전체 프린트)
		
		String a = JOptionPane.showInputDialog("등록할 제목 입력");
		String b = JOptionPane.showInputDialog("등록할 내용 입력");
		String c = JOptionPane.showInputDialog("등록할 이름 입력");
		String d = JOptionPane.showInputDialog("등록할 위치 입력");
		
		게시판DAO dao = new 게시판DAO();
		게시판Bag2 bag = new 게시판Bag2();
		bag.setWpahr(a);
		bag.setSodyd(b);
		bag.setDlfma(c);
		bag.setDnlcl(d);
		dao.create(bag);
		
	}

}
