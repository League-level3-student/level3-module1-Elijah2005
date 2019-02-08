package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
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

		Setup();
	}

	void Setup() {
		actualWord = words.pop();
		for (int i = 0; i < actualWord.length(); i++) {
			displayWord += "_";
			text.setText(displayWord);

		}
		window.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
