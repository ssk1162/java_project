package db연결;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class Icecream메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);
		
		ImageIcon icon = new ImageIcon("003.png");
		Image img = icon.getImage();
		Image img1 = img.getScaledInstance(400, 100, Image.SCALE_SMOOTH);
		ImageIcon img2 = new ImageIcon(img1);
		JLabel lblNewLabel = new JLabel(img2);
		lblNewLabel.setBounds(275, 10, 419, 97);
		f.getContentPane().add(lblNewLabel);
		
		ImageIcon icon1 = new ImageIcon("002.png");
		Image img3 = icon1.getImage();
		Image img4 = img3.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
		ImageIcon img5 = new ImageIcon(img4);
		JLabel lblNewLabel_1 = new JLabel(img5);
		lblNewLabel_1.setBounds(12, 203, 972, 550);
		f.getContentPane().add(lblNewLabel_1);

		
		JButton b1 = new JButton("회원가입");
		b1.setForeground(new Color(240, 128, 128));
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People회원가입 p1 = new People회원가입();
				p1.join("회원가입 페이지 입니다");
				
			}
		});
		b1.setBounds(51, 35, 110, 39);
		f.getContentPane().add(b1);
		
		
		JButton b2 = new JButton("로그인");
		b2.setForeground(new Color(240, 128, 128));
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				People로그인 p2 = new People로그인();
				p2.login("로그인 페이지 입니다");
				

			}
		});
		b2.setBounds(51, 129, 91, 46);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("마이페이지");
		b3.setForeground(new Color(240, 128, 128));
		b3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People정보수정탈퇴 p3 = new People정보수정탈퇴();
				p3.mypage("마이페이지 입니다");
				
			}
		});
		b3.setBounds(191, 129, 135, 46);
		f.getContentPane().add(b3);

		JButton b4 = new JButton("메뉴");
		b4.setForeground(new Color(240, 128, 128));
		b4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHy p4 = new MainHy();
				p4.main("주문하기 입니다");
			}
		});
		b4.setBounds(371, 129, 221, 46);
		f.getContentPane().add(b4);

		JButton b5 = new JButton("리뷰");
		b5.setForeground(new Color(240, 128, 128));
		b5.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ReviewUI2 p5 = new ReviewUI2();
				 p5.main("리뷰 입니다");
			}
		});
		b5.setBounds(647, 129, 91, 46);
		f.getContentPane().add(b5);

		JButton b6 = new JButton("매장찾기");
		b6.setForeground(new Color(240, 128, 128));
		b6.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapUI p6 = new MapUI();
				p6.map("맵 입니다");
			}
		});
		b6.setBounds(801, 129, 110, 46);
		f.getContentPane().add(b6);
		f.setVisible(true);

	}
}
