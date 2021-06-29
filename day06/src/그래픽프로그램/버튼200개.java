package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		// 플로우레이아웃은 알아서 나눔
		JFrame a = new JFrame();
		a.setSize(800, 800);
		FlowLayout flow = new FlowLayout();
		a.setLayout(flow);
		
		for (int i = 0; i < 300; i++) {
			JButton b1 = new JButton( (i + 1) + "번" );
			a.add(b1);
			
		}
		a.setVisible(true);
	}

}
