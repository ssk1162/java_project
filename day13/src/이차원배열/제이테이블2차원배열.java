package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블2차원배열 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300,300);
		// 제목
		String[] title = {"컴퓨터","영어","수학","체육"};
		// 내용
		String[][] contents= {
				{"100","30","40","10"},
				{"20","30","60","40"},
				{"90","50","60","10"},
				{"50","30","30","100"},
				{"100","30","40","10"},
				{"20","30","60","40"},
				{"90","50","60","10"},
				{"50","30","30","100"},
				{"100","30","40","10"},
				{"20","30","60","40"},
				{"90","50","60","10"},
				{"50","30","30","100"},
				{"100","30","40","10"},
				{"20","30","60","40"},
				{"90","50","60","10"},
				{"50","30","30","100"},
				{"100","30","40","10"},
				{"20","30","60","40"},
				{"90","50","60","10"},
				{"50","30","30","100"}
		};
		
		JTable table = new JTable(contents, title);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
	}

}
