package _04_HangMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();

	public static void main(String[] args) {
		HangMan ManHang = new HangMan();

	}

	HangMan() {
		String input = JOptionPane.showInputDialog("ENTER A Number");
		int intput = Integer.parseInt(input);
		window.add(panel);
		panel.add(text);
		window.setVisible(true);
		window.pack();
	}

}
