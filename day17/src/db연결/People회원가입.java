package db연결;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class People회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

//	public static void main(String[] args) {
	public void join(String j) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 153, 153));
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(470, 84, 131, 35);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(255, 238, 131, 35);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(255, 305, 131, 35);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(255, 380, 131, 35);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Tel");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(255, 455, 131, 35);
		f.getContentPane().add(lblNewLabel_2_2);

		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(255, 176, 131, 35);
		f.getContentPane().add(lblNewLabel_3);

		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setBounds(421, 176, 238, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(421, 238, 238, 35);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setBackground(Color.PINK);
		t3.setColumns(10);
		t3.setBounds(421, 305, 238, 35);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setBackground(Color.PINK);
		t4.setColumns(10);
		t4.setBounds(421, 380, 238, 35);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setBackground(Color.PINK);
		t5.setColumns(10);
		t5.setBounds(421, 455, 238, 35);
		f.getContentPane().add(t5);

		JButton b1 = new JButton("취소");

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 취소(프레임을 종료한채 실행)맞는지모름
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			}
		});
		b1.setBounds(387, 557, 91, 23);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("회원가입");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String pw1 = t3.getText();
				String name = t4.getText();
				String tel = t5.getText();

				// if (pw.equals(pw1)) {

				PeopleDAO db = new PeopleDAO();
				if (t2.getText().equals(t3.getText())) {

					try {
						int result = db.create(id, pw, name, tel);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "회원가입이 완료되었습니다");
						}
					} catch (Exception e1) {
						e1.printStackTrace();
						// TODO: handle exception
					}
				} else {
					JOptionPane.showMessageDialog(f, "입력한 비밀번호가 일치하지 않습니다");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});
		b2.setBounds(610, 557, 91, 23);
		f.getContentPane().add(b2);
		
		
		JButton b3 = new JButton("id중복확인");
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				PeopleDAO db = new PeopleDAO();

				// Integer.parseInt(t1.getText());

				try {
					String[] result = db.idcheck(id);
					if (id.equals(result[0])) {
						JOptionPane.showMessageDialog(f,  result[0] + "는 이미 있는 아이디입니다");
					} else {
						JOptionPane.showMessageDialog(f, "사용해도 되는 아이디입니다");
					}

				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}

			}
		});
		b3.setBounds(676, 182, 110, 23);
		f.getContentPane().add(b3);

		f.setVisible(true);
	}
}
