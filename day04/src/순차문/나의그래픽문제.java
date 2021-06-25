package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame a = new JFrame();
		a.getContentPane().setBackground(Color.PINK);
		a.setSize(1000,800);
		a.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 56));
		lblNewLabel.setBounds(37, 10, 404, 112);
		a.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 63));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(475, 11, 459, 112);
		a.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 60));
		lblNewLabel_1.setBounds(37, 241, 404, 112);
		a.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 63));
		t2.setColumns(10);
		t2.setBackground(Color.RED);
		t2.setBounds(475, 242, 459, 112);
		a.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 63));
		lblNewLabel_2.setBounds(37, 472, 350, 66);
		a.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 63));
		t3.setColumns(10);
		t3.setBackground(Color.YELLOW);
		t3.setBounds(475, 473, 459, 66);
		a.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 63));
		t4.setColumns(10);
		t4.setBackground(Color.YELLOW);
		t4.setBounds(475, 549, 459, 66);
		a.getContentPane().add(t4);
		
		JLabel lblNewLabel_2_1 = new JLabel("수학점수");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 63));
		lblNewLabel_2_1.setBounds(37, 548, 350, 66);
		a.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 자동으로 이 함수가 실행
				//버튼을 클릭했을 때 처리내용을 넣으면 댐
				//가져오면 getText, 셋팅할때 setText
				String s1 = t1.getText(); //아메리카노
				
				String food = "얼그레이";
				String food1 = "아메리카노";
				String food2 = "홍차";
				
				if(s1.equals(food) || s1.equals(food1) || s1.equals(food2)) {
					JOptionPane.showMessageDialog(null, "카페나 가자");
				} else {
					JOptionPane.showMessageDialog(null, "물이나 마시자");
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 60));
		btnNewButton.setBounds(37, 146, 897, 66);
		a.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String age = t2.getText();
				
				int age1 = Integer.parseInt(age);
				
				JOptionPane.showMessageDialog(null, "내년 나이는 " + (age1 + 1) + "입니다");
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 60));
		btnNewButton_1.setBounds(37, 382, 897, 66);
		a.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num = t3.getText();
				String num1 = t4.getText();
				
				int num2 = Integer.parseInt(num);
				int num3 = Integer.parseInt(num1);
				
				int avg = num2 + num3;
				double result = avg / 2.0;
				
				JOptionPane.showMessageDialog(null, "평균 점수는 " + result + "입니다");
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 60));
		btnNewButton_2.setBounds(37, 641, 897, 66);
		a.getContentPane().add(btnNewButton_2);
		
		
		a.setVisible(true);
		
	}
}
