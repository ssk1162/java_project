package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class 원도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("    번호");
		lblNewLabel_1.setBounds(12, 147, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    날짜");
		lblNewLabel_2.setBounds(12, 185, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("    제목");
		lblNewLabel_3.setBounds(12, 229, 57, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("    내용");
		lblNewLabel_4.setBounds(12, 317, 57, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(81, 144, 391, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 182, 391, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 226, 391, 21);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.GREEN);
		textField_3.setBounds(81, 273, 391, 104);
		f.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBounds(100, 405, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(209, 405, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("일기삭제");
		btnNewButton_2.setBounds(318, 405, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<오늘의 일기작성을 시작합니다>>>>>>>>>>>>>>>>>>>>");
		lblNewLabel_5.setBounds(0, 122, 484, 15);
		f.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("     나의 일기장");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 55));
		lblNewLabel.setBounds(12, 10, 460, 102);
		f.getContentPane().add(lblNewLabel);
		

		f.setVisible(true);

	}

}
