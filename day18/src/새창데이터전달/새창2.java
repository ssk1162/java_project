package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
	
	public void open2(String m) {
		
		JFrame f = new JFrame(m);
		f.setSize(800,1000);
		
		JButton b1 = new JButton(m + " 화면닫기");
		f.add(b1);
		b1.setBackground(Color.green);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창2을 닫습니다");
				//System.exit(0);
				f.dispose();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		f.setVisible(true);
	}
}
