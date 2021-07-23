package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {

	public void open4(int m) {
		
		
		JFrame f = new JFrame();
		f.setSize(500, 500);

		JButton b1 = new JButton();
		f.add(b1);
		if (m > 30) {
			b1.setText("폭염");
		} else {
			b1.setText("견딜만 해요");
		}
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				f.dispose();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});

		f.setVisible(true);
	}
}