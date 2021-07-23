package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	
	public void open3(String id, String pw) {
		
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton();
		f.add(b1);
		if (id.equals("root") && pw.equals("pass")) {
			b1.setText("로그인 성공");
		} else {
			b1.setText("로그인 실패");
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
