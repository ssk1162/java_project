package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		Font font = new Font("궁서", Font.BOLD, 45);
		
		t1 = new JTextField();
		t1.setBounds(145, 21, 250, 62);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(145, 95, 250, 62);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(25, 21, 92, 62);
		f.getContentPane().add(lblNewLabel);
		
		t3 = new JTextField();
		t3.setBounds(267, 287, 159, 73);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 온도");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2.setBounds(45, 292, 190, 62);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblPw.setBounds(25, 95, 92, 62);
		f.getContentPane().add(lblPw);
		
		JButton b1 = new JButton("로그인 처리");
		b1.setBounds(136, 193, 259, 62);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				새창3 w3 = new 새창3();
				w3.open3(id,pw);
			}
		});
		JButton b2 = new JButton("결정");
		b2.setBounds(136, 386, 259, 62);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = Integer.parseInt(t3.getText());
				
				새창4 w4 = new 새창4();
				w4.open4(c);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		
		f.setVisible(true);
	}

}
