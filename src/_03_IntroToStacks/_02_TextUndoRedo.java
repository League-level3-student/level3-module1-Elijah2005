package _03_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements ActionListener, KeyListener {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JLabel input = new JLabel();
	Stack<Character> character = new Stack<Character>();

	public static void main(String[] args) {
		_02_TextUndoRedo textUndoRedo = new _02_TextUndoRedo();
	}

	_02_TextUndoRedo() {
		window.add(panel);
		panel.add(input);
		window.setVisible(true);
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String text = input.getText();
			char last = text.charAt(text.length() - 1);
			String allButLast = text.substring(0, text.length() - 1);
			input.setText(allButLast);
			character.push(last);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			String text = input.getText();
			if (!character.isEmpty()) {
				text += character.pop();
			}
			input.setText(text);
		} else {
			char c2 = e.getKeyChar();
			String text = input.getText();
			text += c2;
			input.setText(text + "");

		}

		window.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
