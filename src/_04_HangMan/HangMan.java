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
	int lives = 5;

	public static void main(String[] args) {
		HangMan ManHang = new HangMan();

	}

	HangMan() {

		window.add(panel);
		panel.add(text);
		window.setVisible(true);
		window.addKeyListener(this);
		DisplayWords();
		Setup();
	}

	void DisplayWords() {
		String input = JOptionPane.showInputDialog("ENTER A Number");
		int intput = Integer.parseInt(input);
		for (int i = 0; i < intput; i++) {
			String currentWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(currentWord)) {
				i--;
			} else {
				words.push(currentWord);

			}
		}
	}

	void Setup() {

		actualWord = words.pop();
		displayWord = "";
		for (int i = 0; i < actualWord.length(); i++) {
			displayWord += "_";
			text.setText(displayWord);
		}
		window.pack();
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String newWord = "";
		char character = e.getKeyChar();
		boolean correct = false;
		System.out.println("actual " + actualWord.length());
		System.out.println("display " + displayWord.length());
		for (int i = 0; i < actualWord.length(); i++) {
			if (actualWord.charAt(i) == character) {
				newWord += character;
				correct = true;
			} else {
				newWord += displayWord.charAt(i);

			}
		}
		text.setText(newWord);
		displayWord = newWord;
		if (correct == false) {
			lives -= 1;
		}
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "You Ran Out Of Lives GAME OVER");
			String inputs = JOptionPane.showInputDialog("Would You Like To Play Again?");
			if (inputs.equals("yes")) {
				words.clear();
				DisplayWords();
				Setup();
				lives = 5;

			} else {
				window.dispose();
			}
		}

		if (displayWord.equals(actualWord)) {
			Setup();

		}
		if (words.empty()) {
			String input = JOptionPane.showInputDialog("Would You Like To Play Again?");
			if (input.equals("yes")) {
				words.clear();
				DisplayWords();
				Setup();
				lives = 5;
			} else {
				window.dispose();
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
