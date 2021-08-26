package com.mega.mvc05.static1;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	// main이 static이므로 객체생성하지 않아도 접근이 가능한 변수여야 한다
	// main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다
	final static int price = 5000; // 상수
	
	public static void main(String[] args) {
		// main이 static인 이유는
		// 객체생성하지 않아도 main부터 시작하기때문
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		count = new JTextField();
		count.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		count.setBounds(387, 25, 88, 70);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(332, 47, 54, 25);
		f.getContentPane().add(lblNewLabel);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.BLUE);
		result.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		result.setBounds(32, 364, 443, 62);
		f.getContentPane().add(result);
				
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("/Users/kwonsoonsun/Downloads/ewq.jpeg"));
		img.setBounds(32, 107, 443, 230);
		f.getContentPane().add(img);
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("ewq.jpeg");
				img.setIcon(icon);
				result.setText(sum * price + "개");
				
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b1.setBounds(32, 25, 88, 70);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("car.jpeg");
				img.setIcon(icon);
				result.setText(sum * price + "개");

				
			}
		});
		b2.setBackground(Color.MAGENTA);
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b2.setBounds(132, 25, 88, 70);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("짜장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("yayaya.jpeg");
				img.setIcon(icon);
				result.setText(sum * price + "개");

			
			}
		});
		b3.setBackground(Color.RED);
		b3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b3.setBounds(232, 25, 88, 70);
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}
}
