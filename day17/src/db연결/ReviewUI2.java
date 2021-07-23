package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ReviewUI2 {
	private static JTextField tfGoods;
	private static JTextField tfDate;
	private static JTextField tfContents;
	private static JTextField tfReviewid;

	public static void main(String m) {
		JFrame f = new JFrame("**리뷰 작성 페이지**");
		f.getContentPane().setBackground(new Color(255, 182, 193));
		f.setSize(1010, 800);
		f.getContentPane().setLayout(null);

		JLabel lbltitle = new JLabel("*리뷰 작성*");
		lbltitle.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lbltitle.setBounds(440, 24, 168, 56);
		f.getContentPane().add(lbltitle);

		JLabel lblReviewid = new JLabel("작성자 ID");
		lblReviewid.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lblReviewid.setBounds(58, 98, 123, 56);
		f.getContentPane().add(lblReviewid);

		tfReviewid = new JTextField();
		tfReviewid.setFont(new Font("굴림", Font.PLAIN, 18));
		tfReviewid.setColumns(10);
		tfReviewid.setBounds(212, 114, 727, 39);
		f.getContentPane().add(tfReviewid);

		JLabel lblNewLabel = new JLabel("상품명");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lblNewLabel.setBounds(58, 164, 123, 56);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("작성일자");
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lblNewLabel_1.setBounds(58, 244, 123, 56);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("상품만족도");
		lblNewLabel_2.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lblNewLabel_2.setBounds(58, 310, 159, 56);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("후기");
		lblNewLabel_2_1.setFont(new Font("함초롬바탕", Font.BOLD, 28));
		lblNewLabel_2_1.setBounds(58, 466, 76, 56);
		f.getContentPane().add(lblNewLabel_2_1);

		tfGoods = new JTextField();
		tfGoods.setFont(new Font("굴림", Font.PLAIN, 18));
		tfGoods.setBounds(212, 180, 727, 39);
		f.getContentPane().add(tfGoods);
		tfGoods.setColumns(10);

		tfDate = new JTextField(); // "yy-mm-dd"로 placeholder 어떻게 하는걸까?
		tfDate.setFont(new Font("굴림", Font.PLAIN, 18));
		tfDate.setBounds(212, 252, 727, 39);
		f.getContentPane().add(tfDate);
		tfDate.setColumns(10);

		tfContents = new JTextField();
		tfContents.setFont(new Font("굴림", Font.PLAIN, 18));
		tfContents.setBounds(212, 383, 727, 236);
		f.getContentPane().add(tfContents);
		tfContents.setColumns(10);

		JLabel lblgrade = new JLabel("");
		lblgrade.setForeground(Color.PINK);
		lblgrade.setFont(new Font("굴림", Font.PLAIN, 5));
		lblgrade.setBounds(111, 376, 0, 0);
		f.getContentPane().add(lblgrade);

		JButton star5 = new JButton("★★★★★");
		JButton star4 = new JButton("★★★★☆");
		JButton star3 = new JButton("★★★☆☆");
		JButton star2 = new JButton("★★☆☆☆");
		JButton star1 = new JButton("★☆☆☆☆");
		star1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "1점이 선택되었습니다.");
				lblgrade.setText("1");
				star5.setEnabled(false);
				star4.setEnabled(false);
				star3.setEnabled(false);
				star2.setEnabled(false);
			}
		});

		star2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "2점이 선택되었습니다.");
				lblgrade.setText("2");
				star5.setEnabled(false);
				star4.setEnabled(false);
				star3.setEnabled(false);
				star1.setEnabled(false);
			}
		});

		star3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "3점이 선택되었습니다.");
				lblgrade.setText("3");
				star5.setEnabled(false);
				star4.setEnabled(false);
				star2.setEnabled(false);
				star1.setEnabled(false);
			}
		});

		star4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "4점이 선택되었습니다.");
				lblgrade.setText("4");
				star5.setEnabled(false);
				star3.setEnabled(false);
				star2.setEnabled(false);
				star1.setEnabled(false);
			}
		});

		star5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "5점이 선택되었습니다.");
				lblgrade.setText("5");
				star4.setEnabled(false);
				star3.setEnabled(false);
				star2.setEnabled(false);
				star1.setEnabled(false);
			}
		});

		star5.setBackground(new Color(255, 240, 245));
		star5.setForeground(new Color(128, 0, 0));
		star5.setFont(new Font("굴림", Font.BOLD, 12));
		star5.setBounds(351, 310, 107, 56);
		f.getContentPane().add(star5);

		star4.setBackground(new Color(255, 240, 245));
		star4.setForeground(new Color(128, 0, 0));
		star4.setFont(new Font("Dialog", Font.BOLD, 12));
		star4.setBounds(470, 310, 107, 56);
		f.getContentPane().add(star4);

		star3.setBackground(new Color(255, 240, 245));
		star3.setForeground(new Color(128, 0, 0));
		star3.setFont(new Font("Dialog", Font.BOLD, 12));
		star3.setBounds(590, 310, 107, 56);
		f.getContentPane().add(star3);

		star2.setBackground(new Color(255, 240, 245));
		star2.setForeground(new Color(128, 0, 0));
		star2.setFont(new Font("Dialog", Font.BOLD, 12));
		star2.setBounds(713, 310, 107, 56);
		f.getContentPane().add(star2);

		star1.setBackground(new Color(255, 240, 245));
		star1.setForeground(new Color(128, 0, 0));
		star1.setFont(new Font("Dialog", Font.BOLD, 12));
		star1.setBounds(832, 310, 107, 56);
		f.getContentPane().add(star1);

		JButton btnCancel = new JButton("작성취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnCancel.setBackground(new Color(255, 240, 245));
		btnCancel.setFont(new Font("함초롬바탕", Font.BOLD, 24));
		btnCancel.setBounds(212, 651, 284, 56);
		f.getContentPane().add(btnCancel);

		JButton btnComplete = new JButton("리뷰등록");
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// tf에 입력된 값을 가지고 와야 함.
				String reviewid = tfReviewid.getText();
				String goods = tfGoods.getText();
				String date = tfDate.getText();
				String contents = tfContents.getText();
				String grade = lblgrade.getText();

				ReviewDAO db = new ReviewDAO();
				try {
					// 등록버튼을 눌렀을 때 다 입력됐는지 확인해야하니 UI 쪽에서 검사해야. 
					if (reviewid.length() == 0 || goods.length() == 0 || date.length() == 0 || contents.length() == 0
							|| grade.length() == 0) {
						JOptionPane.showMessageDialog(f, "모든 항목에 응답해주세요.");
					} else { // else안에 0이 아닐때 create. create하면 db에 갔다온거라 if 위에 쓰면 x. 다 채워졌을 때 db 갔다와야!!
						int result = db.create(reviewid, goods, date, contents, grade);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "작성하신 리뷰가 등록되었습니다.");
							ReviewUI1 ui1 = new ReviewUI1();
							ui1.ui1();
						} else {
							JOptionPane.showMessageDialog(f, "리뷰 등록에 실패했습니다.");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				tfReviewid.setText("");
				tfGoods.setText("");
				tfDate.setText("");
				tfContents.setText("");
				lblgrade.setText("");
				star5.setEnabled(true);
				star4.setEnabled(true);
				star3.setEnabled(true);
				star2.setEnabled(true);
				star1.setEnabled(true);
				
			} //등록버튼끝
		});
		
		
		
		btnComplete.setBackground(new Color(255, 240, 245));
		btnComplete.setFont(new Font("함초롬바탕", Font.BOLD, 24));
		btnComplete.setBounds(655, 651, 284, 56);
		f.getContentPane().add(btnComplete);

		JButton btnReset = new JButton("별점 재선택");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				star5.setEnabled(true);
				star4.setEnabled(true);
				star3.setEnabled(true);
				star2.setEnabled(true);
				star1.setEnabled(true);
			}
		});
		btnReset.setBackground(new Color(255, 240, 245));
		btnReset.setFont(new Font("함초롬바탕", Font.BOLD, 13));
		btnReset.setBounds(212, 310, 123, 56);
		f.getContentPane().add(btnReset);

		f.setVisible(true);

	}
}
