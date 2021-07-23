package db연결;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class People로그인 {
	private static JTextField t1;
	private static JTextField t2;

	//public static void main(String[] args) {
	public void login(String l) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 153, 153));
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(470, 84, 131, 35);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(255, 176, 131, 35);
		f.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(255, 238, 131, 35);
		f.getContentPane().add(lblNewLabel_1);

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

		JButton b1 = new JButton("취소");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t1.setText("");
				t2.setText("");
			}
		});
		b1.setBounds(382, 335, 91, 23);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("로그인");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
//				int id2 =Integer.parseInt(t1.getText());
//				int pw2 =Integer.parseInt(t2.getText());

				PeopleDAO db = new PeopleDAO();

				try {
					String[] result = db.read(id, pw);
//					if (id2 == 1 && pw2 ==1) {
//						JOptionPane.showInputDialog(f, "로그인 성공" + result[0]);
//					}
					if (id.equals(result[0]) && pw.equals(result[1])) {
						JOptionPane.showMessageDialog(f, "아이디: " + result[0] + "로그인 성공");
					}
//					if (id.equals(result[0]) && pw.equals(result[1])) {
//						JOptionPane.showInputDialog(f, "로그인 성공" + result[0]);
//					}
					
					else {
						JOptionPane.showMessageDialog(f, "로그인 실패");
					}

				} catch (Exception e2) {
					e2.printStackTrace();
					// TODO: handle exception
				}
				t1.setText("");
				t2.setText("");

			}
		});
		b2.setBounds(544, 335, 91, 23);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
