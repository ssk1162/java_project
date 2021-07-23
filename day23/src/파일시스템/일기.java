package 파일시스템;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(36, 18, 139, 37);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_1.setBounds(36, 78, 139, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_2.setBounds(36, 171, 139, 37);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t1.setBounds(198, 16, 161, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(198, 78, 161, 39);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(198, 146, 161, 124);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = t1.getText();
				String b = t2.getText();
				String c = t3.getText();
				
				try {
					FileWriter file = new FileWriter("일기");
					file.write(a + "\n");
					file.write(b + "\n");
					file.write(c + "\n");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnNewButton.setBounds(36, 290, 322, 49);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		f.setVisible(true);
	}
}
