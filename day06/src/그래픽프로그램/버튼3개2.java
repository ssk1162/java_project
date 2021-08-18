package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame r = new JFrame();
		r.getContentPane().setBackground(Color.MAGENTA);
		r.setSize(500, 500);
		r.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 10, 460, 199);
		r.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(12, 219, 460, 232);
		r.getContentPane().add(m);
		
		ImageIcon car1 = new ImageIcon("1.peg");
		ImageIcon car2 = new ImageIcon("00_1.jpg");
		b.setIcon(car1);
		m.setIcon(car2);
		
		
		r.setVisible(true);
		
		
		
	}
}
