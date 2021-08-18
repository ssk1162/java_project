package 그래픽문제;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽2 {

	public static void main(String[] args) {

		JFrame r = new JFrame(); // j프레임 창 생성
		r.setSize(800, 750); // 창 크기 설정
		FlowLayout flow = new FlowLayout(); // 레이아웃 설정
		r.setLayout(flow);
		int[] seat = new int[200]; // 배열 {0,0,0,0,...} 200개

		for (int i = 0; i < 200; i++) {

			JButton a = new JButton(i + ""); // 버튼 생성

			a.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { // 액션 이벤트 값을 e에 저장

					String s = e.getActionCommand(); // 버튼 값을 문자열로 저장
					int index = Integer.parseInt(s); // String값을 인트로 변환
					seat[index] = 1; // 배열 값을 0 > 1로 나타내기

					JOptionPane.showMessageDialog(r, index + " 선택함");

					a.setEnabled(false); // 클릭했을때 비활성화

				}
			});
			r.add(a); // 버튼을 창에 활성화 시킴

		}

		JButton a1 = new JButton("<<<<<<<<<결제 하기>>>>>>>>>"); // 결제하기 버튼
		a1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int count = 0;
				final int MONEY = 10000; // final int시 변수값 대문자 / 고정값 10000원
				String sum = "";

				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++; // 선택한 좌석
						sum += i + "번 "; // 선택한 번호
					}
				}
				int reault = count * MONEY; // 좌석 선택 수 * 10000
				JOptionPane.showMessageDialog(r, "총 결제 금액은 " + reault + "\n" + sum + " 선택 하셨습니다");
				r.setTitle("영화예매 ㄱㄱ " + "선택된 좌석 수 " + count + "자리 ");

			}
		});
		r.add(a1);

		r.setVisible(true); // 창 나타내기

	}

}
