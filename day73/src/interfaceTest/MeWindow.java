package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MeWindow {
	
	JLabel result;
	
	public MeWindow() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("버튼1");
		f.add(b1);

		JButton b2 = new JButton("버튼2");
		f.add(b2);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String j1 = JOptionPane.showInputDialog("어디로 갈까요?");
				String j2 = JOptionPane.showInputDialog("언제 갈까요?");
				result.setText(j1 + "로 " + j2 + "에 떠나요");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date date = new Date();
				result.setText(date.toString());
				
			}
		});
		
		result = new JLabel("결과===============");
		f.add(result);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new MeWindow();
		
	}
}