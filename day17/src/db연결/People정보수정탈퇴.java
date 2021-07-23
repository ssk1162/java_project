package db연결;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class People정보수정탈퇴 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	// public static void main(String[] args) {
	public void mypage(String m) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(240, 128, 128));
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(255, 176, 131, 35);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(255, 238, 131, 35);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(255, 305, 131, 35);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("전화번호");
		lblNewLabel_2_1.setBounds(255, 380, 131, 35);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("회원정보수정");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(470, 84, 131, 35);
		f.getContentPane().add(lblNewLabel_2_2);

		t1 = new JTextField();
		t1.setBounds(421, 176, 238, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(421, 238, 238, 35);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(421, 305, 238, 35);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(421, 380, 238, 35);
		f.getContentPane().add(t4);

		JButton b1 = new JButton("취소");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		b1.setBounds(380, 465, 91, 23);
		f.getContentPane().add(b1);

		JButton b3 = new JButton("탈퇴");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();

				PeopleDAO db = new PeopleDAO();

				try {
					int result = db.delete(id, pw);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴가 완료되었습니다");
					} else {
						JOptionPane.showMessageDialog(f, "탈퇴에 실패했습니다. 아이디와 비밀번호가 일치하지 않습니다");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b3.setBounds(50, 26, 91, 23);
		f.getContentPane().add(b3);

		JButton b2 = new JButton("수정");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				PeopleDAO db = new PeopleDAO();

				try {
					int result = db.update(id, pw, name, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보 수정이 완료되었습니다");
					} else {

						JOptionPane.showMessageDialog(f, "아이디 불일치로 실패했습니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		b2.setBounds(568, 465, 91, 23);
		f.getContentPane().add(b2);
		f.setVisible(true);

	}
}
