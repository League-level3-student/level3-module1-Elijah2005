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
	int lives = 3;

	public static void main(String[] args) {
		HangMan ManHang = new HangMan();

	}

	HangMan() {
		String input = JOptionPane.showInputDialog("ENTER A Number");
		int intput = Integer.parseInt(input);
		window.add(panel);
		panel.add(text);
		window.setVisible(true);
		window.addKeyListener(this);
		for (int i = 0; i < intput; i++) {
			String currentWord = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(currentWord)) {
				i--;
			} else {
				words.push(currentWord);
				System.out.println("" + currentWord);
			}
		}

		Setup();
	}

	void Setup() {
		actualWord = words.pop();
		displayWord = "";
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
		String newWord = "";
		char character = e.getKeyChar();
		boolean correct = true;
		for (int i = 0; i < actualWord.length(); i++) {
			if (actualWord.charAt(i) == character) {
				newWord += character;

			} else {
				newWord+=displayWord.charAt(i);
				correct = false;

			}
		}
		if(correct == false) {
			lives -= 1;
		}	
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "You Ran Out Of Lives GAME OVER");
			}
		
		
		text.setText(newWord);
		displayWord = newWord;
		if (displayWord.equals(actualWord)) {
			Setup();

		}
		if(words.empty()) {
			JOptionPane.showConfirmDialog(null, "Would You Like To Play Again?");
			Setup();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
