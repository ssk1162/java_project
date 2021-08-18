package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물삭제 {
	
	public static void main(String[] args) {
		
		String bb = JOptionPane.showInputDialog("게시물 삭제");
		
		BbsDB dd = new BbsDB();
		
		dd.delete(bb);
	}
}
