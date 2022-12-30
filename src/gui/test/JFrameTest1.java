package gui.test;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel lbl = new JLabel(" ", JLabel.CENTER);
		ImageIcon icon = new ImageIcon("images/스노우볼.jpg");
		lbl.setIcon(icon);
		frame.add(lbl);
		frame.setTitle("JFrame 연습1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200, 200);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
	}

}
