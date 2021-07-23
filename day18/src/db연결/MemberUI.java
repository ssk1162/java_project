package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		
		JFrame r = new JFrame();
		r.setSize(700, 700);
		r.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel.setBounds(64, 69, 177, 63);
		r.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t1.setBounds(272, 67, 248, 68);
		r.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(272, 161, 248, 68);
		r.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(64, 163, 177, 63);
		r.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(272, 254, 248, 68);
		r.getContentPane().add(t3);
		
		JLabel lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_2.setBounds(64, 256, 177, 63);
		r.getContentPane().add(lblNewLabel_2);
		
		t4 = new JTextField();
		t4.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(272, 346, 248, 68);
		r.getContentPane().add(t4);
		
		JLabel 이름 = new JLabel("아이디");
		이름.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		이름.setBounds(64, 348, 177, 63);
		r.getContentPane().add(이름);
		
		JButton btn1 = new JButton("가입");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				String pw = t2.getText();
				String tel = t3.getText();
				String name = t4.getText();
				
				MemberDAOO db = new MemberDAOO();
				try {
					int result = db.create(id, pw, name, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(r, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(r, "회원가입 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btn1.setBounds(107, 469, 117, 116);
		r.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("탈퇴");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 아이디 >>");
				
				MemberDAOO db = new MemberDAOO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(r, "탈퇴 성공했습니다");
					} else {
						JOptionPane.showMessageDialog(r, "탈퇴 실패했습니다");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btn2.setBounds(283, 469, 117, 116);
		r.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("수정");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("수정할 아이디 >>");
				String tel = JOptionPane.showInputDialog("수정할 전화번호 >>");
				
				MemberDAOO db = new MemberDAOO();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(r, "수정 성공했습니다");
					} else {
						JOptionPane.showMessageDialog(r, "수정 실패했습니다");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btn3.setBounds(460, 469, 117, 116);
		r.getContentPane().add(btn3);
		
		
		r.setVisible(true);
		
	}
}
