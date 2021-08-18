package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽문제1 {
	private static JTextField x1;
	private static JTextField x2;

	public static void main(String[] args) {
		
		JFrame g = new JFrame();
		g.setSize(600,500);
		g.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel.setBounds(26, 29, 173, 65);
		g.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(26, 126, 173, 65);
		g.getContentPane().add(lblNewLabel_1);
		
		x1 = new JTextField();
		x1.setFont(new Font("굴림", Font.PLAIN, 50));
		x1.setBounds(228, 29, 253, 65);
		g.getContentPane().add(x1);
		x1.setColumns(10);
		
		x2 = new JTextField();
		x2.setFont(new Font("굴림", Font.PLAIN, 50));
		x2.setColumns(10);
		x2.setBounds(228, 126, 253, 65);
		g.getContentPane().add(x2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num = x1.getText();
				String num1 = x2.getText();
				
				int sum = Integer.parseInt(num);
				int sum1 = Integer.parseInt(num1);
				
				int pl = sum + sum1;
				
				JOptionPane.showMessageDialog(null, "더하기 값은 " + pl);
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton.setBounds(12, 255, 225, 99);
		g.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num2 = x1.getText();
				String num3 = x2.getText();
				
				int sum2 = Integer.parseInt(num2);
				int sum3 = Integer.parseInt(num3);
				
				int ma = sum2 - sum3;
				
				JOptionPane.showMessageDialog(null, "빼기 값은 " + ma);
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton_1.setBounds(269, 255, 225, 99);
		g.getContentPane().add(btnNewButton_1);
		g.setVisible(true);

	}

}
