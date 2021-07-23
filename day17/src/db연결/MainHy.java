package db연결;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainHy {

	public static void main(String m) {
		//창 구현
		JFrame f = new JFrame();
		
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);
		
		String tel = "123";
		String flavor = null;
	
		ImageIcon mmm = new ImageIcon("mm.png");
		ImageIcon otr = new ImageIcon("1otr.png");
		ImageIcon mc = new ImageIcon("2mc.png");
		ImageIcon ss = new ImageIcon("3ss.png");
		ImageIcon cns = new ImageIcon("4cns.png");
		ImageIcon pta = new ImageIcon("5pta.png");
		ImageIcon vvs = new ImageIcon("6vvs.png");
		ImageIcon bhs = new ImageIcon("7bhs.png");
		ImageIcon ess = new ImageIcon("8ess.png");
		ImageIcon bn = new ImageIcon("9bn.png");
		ImageIcon ja = new ImageIcon("10ja.png");
		
		
		JLabel m1 = new JLabel("");
		m1.setBounds(0, 0, 988, 245);
		f.getContentPane().add(m1);
		m1.setIcon(mmm);
		
		JLabel ab1 = new JLabel("");
		ab1.setBounds(17, 170, 180, 180);
		f.getContentPane().add(ab1);
		ab1.setIcon(otr);
		
		JLabel ab2 = new JLabel("");
		ab2.setBounds(205, 170, 180, 180);
		f.getContentPane().add(ab2);
		ab2.setIcon(mc);
		
		JLabel ab3 = new JLabel("");
		ab3.setBounds(398, 170, 180, 180);
		f.getContentPane().add(ab3);
		ab3.setIcon(ss);
		
		JLabel ab4 = new JLabel("");
		ab4.setBounds(586, 170, 180, 180);
		f.getContentPane().add(ab4);
		ab4.setIcon(cns);
		
		JLabel ab5 = new JLabel("");
		ab5.setBounds(774, 170, 180, 180);
		f.getContentPane().add(ab5);
		ab5.setIcon(pta);
		
		JLabel ab6 = new JLabel("");
		ab6.setBounds(17, 427, 180, 180);
		f.getContentPane().add(ab6);
		ab6.setIcon(vvs);
		
		JLabel ab7 = new JLabel("");
		ab7.setBounds(205, 427, 180, 180);
		f.getContentPane().add(ab7);
		ab7.setIcon(bhs);
		
		JLabel ab8 = new JLabel("");
		ab8.setBounds(398, 427, 180, 180);
		f.getContentPane().add(ab8);
		ab8.setIcon(ess);
		
		JLabel ab9 = new JLabel("");
		ab9.setBounds(586, 427, 180, 180);
		f.getContentPane().add(ab9);
		ab9.setIcon(bn);
		
		JLabel ab10 = new JLabel("");
		ab10.setBounds(774, 427, 180, 180);
		f.getContentPane().add(ab10);
		ab10.setIcon(ja);
		
		JLabel abb1 = new JLabel("rainbow");
		abb1.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb1.setHorizontalAlignment(SwingConstants.CENTER);
		abb1.setBounds(17, 360, 180, 21);
		f.getContentPane().add(abb1);
		
		JLabel abb2 = new JLabel("mint");
		abb2.setHorizontalAlignment(SwingConstants.CENTER);
		abb2.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb2.setBounds(205, 360, 180, 21);
		f.getContentPane().add(abb2);
		
		JLabel abb3 = new JLabel("star");
		abb3.setHorizontalAlignment(SwingConstants.CENTER);
		abb3.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb3.setBounds(398, 360, 180, 21);
		f.getContentPane().add(abb3);
		
		JLabel abb4 = new JLabel("tree");
		abb4.setHorizontalAlignment(SwingConstants.CENTER);
		abb4.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb4.setBounds(586, 360, 180, 21);
		f.getContentPane().add(abb4);
		
		JLabel abb5 = new JLabel("pistachio");
		abb5.setHorizontalAlignment(SwingConstants.CENTER);
		abb5.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb5.setBounds(774, 360, 180, 21);
		f.getContentPane().add(abb5);
		
		
		JLabel abb6 = new JLabel("strawberry");
		abb6.setHorizontalAlignment(SwingConstants.CENTER);
		abb6.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb6.setBounds(17, 617, 180, 21);
		f.getContentPane().add(abb6);
		
		JLabel abb7 = new JLabel("wind");
		abb7.setHorizontalAlignment(SwingConstants.CENTER);
		abb7.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb7.setBounds(205, 617, 180, 21);
		f.getContentPane().add(abb7);
		
		JLabel abb8 = new JLabel("cotton");
		abb8.setHorizontalAlignment(SwingConstants.CENTER);
		abb8.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb8.setBounds(398, 617, 180, 21);
		f.getContentPane().add(abb8);
		
		JLabel abb9 = new JLabel("vanilla");
		abb9.setHorizontalAlignment(SwingConstants.CENTER);
		abb9.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb9.setBounds(586, 617, 180, 21);
		f.getContentPane().add(abb9);
		f.setVisible(true);
		
		JLabel abb10 = new JLabel("almond");
		abb10.setHorizontalAlignment(SwingConstants.CENTER);
		abb10.setFont(new Font("돋움체", Font.PLAIN, 18));
		abb10.setBounds(774, 617, 180, 21);
		f.getContentPane().add(abb10);
		
		JButton bt1 = new JButton("구매");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb1.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb1.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt1.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt1.setBackground(Color.LIGHT_GRAY);
		bt1.setBounds(75, 383, 66, 29);
		f.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("구매");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb2.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb2.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		bt2.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt2.setBackground(Color.LIGHT_GRAY);
		bt2.setBounds(263, 382, 66, 29);
		f.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("구매");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb3.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb3.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt3.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt3.setBackground(Color.LIGHT_GRAY);
		bt3.setBounds(456, 382, 66, 29);
		f.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("구매");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb4.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb4.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt4.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt4.setBackground(Color.LIGHT_GRAY);
		bt4.setBounds(647, 383, 66, 29);
		f.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("구매");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb5.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb5.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt5.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt5.setBackground(Color.LIGHT_GRAY);
		bt5.setBounds(832, 383, 66, 29);
		f.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("구매");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb6.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb6.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt6.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt6.setBackground(Color.LIGHT_GRAY);
		bt6.setBounds(75, 641, 66, 29);
		f.getContentPane().add(bt6);
		
		JButton bt7 = new JButton("구매");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb7.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb7.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt7.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt7.setBackground(Color.LIGHT_GRAY);
		bt7.setBounds(263, 640, 66, 29);
		f.getContentPane().add(bt7);
		
		JButton bt8 = new JButton("구매");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb8.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb8.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt8.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt8.setBackground(Color.LIGHT_GRAY);
		bt8.setBounds(456, 640, 66, 29);
		f.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("구매");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb9.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb9.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt9.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt9.setBackground(Color.LIGHT_GRAY);
		bt9.setBounds(647, 641, 66, 29);
		f.getContentPane().add(bt9);
		
		JButton bt10 = new JButton("구매");
		bt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, tel + "로 주문문자 발송되었습니다! \n" + abb10.getText() + "를 10분 내로 픽업하세요!");
				MenuDAO db = new MenuDAO();
				try {
					String f = abb10.getText();
					db.create(f, tel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		bt10.setFont(new Font("돋움체", Font.PLAIN, 14));
		bt10.setBackground(Color.LIGHT_GRAY);
		bt10.setBounds(832, 641, 66, 29);
		f.getContentPane().add(bt10);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
