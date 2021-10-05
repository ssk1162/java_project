package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나를 눌러라");
		f.add(b1);
		
		JButton b2 = new JButton("클릭!!");
		f.add(b2);
		
		JButton b3 = new JButton("클릭!!");
		f.add(b3);
		
		ClickClass click = new ClickClass();
		b1.addActionListener(click);
		b2.addActionListener(click);
		
//		Click2Class click2 = new Click2Class();
//		b2.addActionListener(click2);
		
		b2.addActionListener(new Click2Class());
		
		
		
		f.setVisible(true);
	}

}
