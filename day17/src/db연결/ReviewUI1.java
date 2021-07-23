package db연결;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import db연결.ReviewDAO;


public class ReviewUI1 {
//	public static void main(String[] args)
//	public void ui1() <-메인을 지운다. 값을 안 받으니 ()로 비워둠
	public void ui1() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 182, 193));
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("*리뷰 게시판*");
		lbltitle.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lbltitle.setBounds(415, 24, 206, 56);
		f.getContentPane().add(lbltitle);
		
		JLabel label = new JLabel("");
		label.setBounds(167, 117, 798, 400);
		f.getContentPane().add(label);
		ImageIcon ice = new ImageIcon("ice.png");
		label.setIcon(ice);
		
		JButton btnWrite = new JButton("작성");
		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewUI2 p1 = new ReviewUI2();
				p1.main("돌아가기");
			}
		});
		btnWrite.setFont(new Font("함초롬바탕", Font.BOLD, 18));
		btnWrite.setBackground(new Color(255, 240, 245));
		btnWrite.setBounds(68, 554, 182, 126);
		f.getContentPane().add(btnWrite);
		
		JButton btnModify = new JButton("수정");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reviewid = JOptionPane.showInputDialog("리뷰 작성시 사용한 아이디 입력");
				String contents = JOptionPane.showInputDialog("수정할 리뷰 내용 입력");
				ReviewDAO db = new ReviewDAO();
				try {
					int result = db.update(reviewid, contents);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정이 성공적으로 반영되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "수정을 실패하였습니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnModify.setFont(new Font("함초롬바탕", Font.BOLD, 18));
		btnModify.setBackground(new Color(255, 240, 245));
		btnModify.setBounds(389, 554, 191, 126);
		f.getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reviewid = JOptionPane.showInputDialog("리뷰 작성시 사용한 id 입력");
				ReviewDAO db = new ReviewDAO();
				try {
					int result = db.delete(reviewid);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "작성한 리뷰글을 삭제 성공했습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "리뷰글 삭제를 실패했습니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("함초롬바탕", Font.BOLD, 18));
		btnDelete.setBackground(new Color(255, 240, 245));
		btnDelete.setBounds(745, 554, 182, 126);
		f.getContentPane().add(btnDelete);
		
		
		f.setVisible(true);
	}
}
