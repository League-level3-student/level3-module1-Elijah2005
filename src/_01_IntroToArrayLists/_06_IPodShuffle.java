package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015
public class _06_IPodShuffle implements ActionListener {
	ArrayList<Song> s1 = new ArrayList<Song>();
	JButton b = new JButton();
	JFrame f = new JFrame();
	JPanel p = new JPanel();

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song koconut = new Song("koconut.mp3");
		Song bro = new Song("Everyday Bro.mp3");
		Song duck = new Song("The Duck Song.mp3");
		// s.play();
		// s.setDuration(5);
		f.add(p);
		p.add(b);
		b.setText("Surprise Me!");
		f.setVisible(true);
		f.pack();
		b.addActionListener((ActionListener) this);
		s1.add(koconut);
		s1.add(bro);
		s1.add(duck);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int randomSong = new Random().nextInt(s1.size());
		Song s = s1.get(randomSong);
		s.play();

	}
}