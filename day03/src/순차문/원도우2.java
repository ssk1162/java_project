package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 원도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌렀나");
				JOptionPane.showMessageDialog(f, "눌렀나");
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("HY울릉도B", Font.BOLD, 20));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setBounds(160, 38, 156, 62);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌렀군");
				JOptionPane.showMessageDialog(f, "눌렀군");
				
			}
		});
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("HY목판L", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(160, 110, 156, 68);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("HY궁서B", Font.BOLD, 23));
		textField.setBackground(Color.PINK);
		textField.setBounds(145, 247, 247, 56);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setBounds(59, 252, 74, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(43, 345, 96, 45);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.BOLD, 23));
		textField_1.setBackground(new Color(255, 175, 175));
		textField_1.setBounds(145, 332, 247, 56);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		f.setVisible(true);

	}
}
