package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow2 implements ActionListener {
	
	JLabel result;
	
	public MyWindow2() {
		
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나를 눌러라");
		f.add(b1);
		
		JButton b2 = new JButton("클릭!!");
		f.add(b2);
		
		JButton b3 = new JButton("나 클릭!!=================");
		f.add(b3);
		
		//ClickClass click = new ClickClass();
		b1.addActionListener(this);
		b2.addActionListener(this);
				
		//b2.addActionListener(new Click2Class());
		
		result = new JLabel("결과");
		result.setFont(new Font("궁서", Font.BOLD, 20));
		result.setForeground(Color.BLUE);
		f.add(result);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyWindow2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText("버튼을 누름");
	}
}
