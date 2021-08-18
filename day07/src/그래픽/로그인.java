package 그래픽;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static final JLabel lblNewLabel = new JLabel("아이디");
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame a = new JFrame("로그인 처리 화면");
		a.setSize(500, 500);
		a.getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setBounds(23, 18, 119, 57);
		a.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblNewLabel_1.setBounds(23, 87, 119, 57);
		a.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		label.setBounds(23, 341, 220, 97);
		a.getContentPane().add(label);

		t1 = new JTextField();
		t1.setBounds(174, 18, 270, 57);
		a.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(174, 87, 270, 57);
		a.getContentPane().add(t2);

		JButton btn1 = new JButton("로그인 확인");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누를 때마다 실행

				String s1 = t1.getText();
				String s2 = t2.getText();

				if (s1.equals("apple") && s2.equals("pass")) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					label.setText("로그인 성공");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
					label.setText("로그인 실패");
				}

			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btn1.setBounds(23, 194, 220, 123);
		a.getContentPane().add(btn1);

		JButton btn2 = new JButton("지우기");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				t1.setText("");
				t2.setText("");

			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btn2.setBounds(255, 194, 220, 123);
		a.getContentPane().add(btn2);

		a.setVisible(true);

	}
}
