package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame r = new JFrame("나의 버튼 5개");
		r.setSize(500, 500);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(r, "북쪽입니다");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		r.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 30));
		r.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("남쪽");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(r, "남쪽입니다");
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 30));
		r.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 30));
		r.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("가운데");
		btnNewButton_4.setBackground(Color.MAGENTA);
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 30));
		r.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		r.setVisible(true);
		
		

	}
}
