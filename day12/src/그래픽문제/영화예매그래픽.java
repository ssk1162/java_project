package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class 영화예매그래픽 {

	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(1010, 800);
		int[] seat = new int[200];

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + ""); // String.valueOf(0);
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;
					int count = 0;

					JOptionPane.showMessageDialog(f, index + "선택댐");
					// 버튼을 비활성화
					b.setEnabled(false);
					b.setBackground(Color.red);

				}
			});
			f.getContentPane().add(b);

		}
		JButton b2 = new JButton("<<<<<<<<<<결제 하기>>>>>>>>>>>");
		b2.setBounds(249, 5, 302, 29);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 결제하기 버튼을 누르면
				// 1 배열안에 1이 몇개인지 세서
				// 2 금액 10000원씩 계산 후에
				// 3 결제금액을 알려주세요
				int count = 0;
				final int MONEY = 10000;
				String sum = "";

				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum += i + "번 ";
					}
				}
				int paymoney = count * MONEY;
				JOptionPane.showMessageDialog(f, "결제할 금액 " + paymoney);
				JOptionPane.showMessageDialog(f, "예약한 좌석번호 " + sum);
			}
		});
		f.getContentPane().setLayout(null);

		b2.setBackground(Color.yellow);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
