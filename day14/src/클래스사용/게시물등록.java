package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물등록 {
	
	public static void main(String[] args) {
		
		String aa = JOptionPane.showInputDialog("게시물 등록");
		
		BbsDB cc = new BbsDB();
		
		cc.create(aa);
		
	}
}
