package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	Stack<String> words = new Stack<String>();
	String displayWord = "";
	String actualWord = "";

	public static void main(String[] args) {
		HangMan ManHang = new HangMan();

	}

	HangMan() {
		String input = JOptionPane.showInputDialog("ENTER A Number");
		int intput = Integer.parseInt(input);
		window.add(panel);
		panel.add(text);
		window.setVisible(true);
		for (int i = 0; i < intput; i++) {
			String currentWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(currentWord)) {
				i--;
			} else {
				words.push(currentWord);
			}
		}

		window.pack();
	}

	void Setup() {
		actualWord = words.pop();
		for (int i = 0; i < actualWord.length(); i++) {

		}
	}

}
