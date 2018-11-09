package _01_IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle {
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		// Song s = new Song("demo.mp3");
		// s.play();
		// s.setDuration(5);
		ArrayList<Song> s1 = new ArrayList<Song>();

		JButton j = new JButton();
		j.setText("Surprise Me!");
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		p.add(j);
		f.setVisible(true);
		f.pack();

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
}