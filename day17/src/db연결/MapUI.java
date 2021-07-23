package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MapUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void map(String m) {

		JFrame r = new JFrame("베스킨라빈스 매장");
		r.getContentPane().setBackground(Color.PINK);
		r.setSize(1010, 800);
		r.getContentPane().setLayout(null);
		r.setLocationRelativeTo(null);

		JLabel label = new JLabel("베스킨라빈스 매장위치");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		label.setBounds(343, 64, 325, 47);
		r.getContentPane().add(label);
		label.setHorizontalAlignment(JLabel.CENTER);

		JButton btn = new JButton("서울");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("서울 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("03.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn.setBackground(Color.WHITE);
		btn.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn.setBounds(103, 206, 161, 47);
		r.getContentPane().add(btn);

		JButton btn1 = new JButton("경기");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("경기 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("06.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn1.setBounds(423, 206, 161, 47);
		r.getContentPane().add(btn1);

		JButton btn2 = new JButton("경남");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("경남 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("07.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn2.setBounds(747, 206, 161, 47);
		r.getContentPane().add(btn2);

		JButton btn3 = new JButton("강원");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("강원 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("04.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn3.setBounds(747, 265, 161, 47);
		r.getContentPane().add(btn3);

		JButton btn4 = new JButton("광주");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("광주 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("05.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn4.setBounds(747, 323, 161, 47);
		r.getContentPane().add(btn4);

		JButton btn5 = new JButton("대구");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("대구 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("02.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn5.setBounds(423, 323, 161, 47);
		r.getContentPane().add(btn5);

		JButton btn6 = new JButton("인천");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("인천 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("08.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn6.setBounds(103, 323, 161, 47);
		r.getContentPane().add(btn6);

		JButton btn7 = new JButton("제주");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("제주 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("09.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn7.setBounds(103, 265, 161, 47);
		r.getContentPane().add(btn7);

		JButton btn8 = new JButton("충남");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame q = new JFrame();
				q.setSize(1000, 500);

				String store = JOptionPane.showInputDialog("충남 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {

					String[] a = db.read(store);

					JLabel l1 = new JLabel("<html>" + "매장명: " + a[0] + "<br>" + "주소: " + a[1] + "<br>" + "전화번호: " + a[2]
							+ "<br>" + "운영시간: " + a[3] + "</html>");
					l1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
					l1.setBounds(50, 50, 400, 300);
					q.getContentPane().add(l1);
					l1.setHorizontalAlignment(JLabel.LEFT);

					ImageIcon icon = new ImageIcon("01.png");
					Image img = icon.getImage();
					Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon img2 = new ImageIcon(img1);
					JLabel l2 = new JLabel(img2);
					l2.setBounds(103, 206, 805, 397);
					q.getContentPane().add(l2);
					l2.setHorizontalAlignment(JLabel.RIGHT);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				q.setVisible(true);

			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn8.setBounds(423, 265, 161, 47);
		r.getContentPane().add(btn8);

		JButton btn9 = new JButton("매장찾기 종료");
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn9.setBounds(423, 635, 161, 47);
		r.getContentPane().add(btn9);

		JLabel lblNewLabel = new JLabel("매장 :");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel.setBounds(109, 405, 122, 47);
		r.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t1.setBounds(244, 405, 206, 47);
		r.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("주소 :");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_1.setBounds(109, 472, 122, 47);
		r.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(244, 472, 206, 47);
		r.getContentPane().add(t2);

		JLabel lblTime = new JLabel("OPEN/CLOSE :");
		lblTime.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblTime.setBounds(508, 472, 181, 47);
		r.getContentPane().add(lblTime);

		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(702, 472, 206, 47);
		r.getContentPane().add(t3);

		JLabel lblNewLabel_3 = new JLabel("전화번호 :");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_3.setBounds(508, 405, 122, 47);
		r.getContentPane().add(lblNewLabel_3);

		t4 = new JTextField();
		t4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		t4.setColumns(10);
		t4.setBounds(702, 405, 206, 47);
		r.getContentPane().add(t4);

		JButton btn00 = new JButton("추가");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String store = t1.getText();
				String location = t2.getText();
				String time = t3.getText();
				String tel = t4.getText();

				MapDAO db = new MapDAO();

				try {
					int result = db.create(store, location, tel, time);
					if (result == 1) {
						JOptionPane.showMessageDialog(r, "매장 추가 성공");
					} else {
						JOptionPane.showMessageDialog(r, "매장 추가 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");

			}
		});
		btn00.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn00.setBounds(337, 542, 161, 47);
		r.getContentPane().add(btn00);

		JButton btn11 = new JButton("삭제");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String store = JOptionPane.showInputDialog("삭제할 매장명 입력 >>");

				MapDAO db = new MapDAO();

				try {
					int result = db.delete(store);
					if (result == 1) {
						JOptionPane.showMessageDialog(r, "매장 삭제 성공");
					} else {
						JOptionPane.showMessageDialog(r, "매장 삭제 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btn11.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn11.setBounds(517, 542, 161, 47);
		r.getContentPane().add(btn11);

		ImageIcon icon = new ImageIcon("00.png");
		Image img = icon.getImage();
		Image img1 = img.getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon img2 = new ImageIcon(img1);
		JLabel label1 = new JLabel(img2);
		label1.setBounds(103, 206, 805, 397);
		r.getContentPane().add(label1);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				r.dispose();
			}
		});

		r.setResizable(false);
		r.setVisible(true);

	}
}
