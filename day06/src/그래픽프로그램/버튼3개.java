package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame r = new JFrame();
		r.getContentPane().setBackground(Color.MAGENTA);
		r.setSize(500, 500);
		r.getContentPane().setLayout(null); // 레이아웃을 지정하지 않으면 
		
		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for(int i=0; i<10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(110, 44, 270, 59);
		r.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(110, 115, 270, 59);
		r.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<3; i++) {
					System.out.println("커피*우유");
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(110, 186, 270, 59);
		r.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1:짱!");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<3; i++) {
					System.out.println( (i + 1) + ":짱!");
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		btnNewButton_2_1.setBackground(Color.GREEN);
		btnNewButton_2_1.setBounds(110, 265, 270, 59);
		r.getContentPane().add(btnNewButton_2_1);
		// 내가 넣고 싶은 위치에 넣을 수 있다
		
		
		
		
		r.setVisible(true);
		
		

	}
}
