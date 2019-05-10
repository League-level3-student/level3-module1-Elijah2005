package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JButton addEntry = new JButton();
	JButton searchByID = new JButton();
	JButton removeEntry = new JButton();
	JButton viewList = new JButton();
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	String ID;
	String name;
	String remove;
	HashMap<Integer, String> search = new HashMap<Integer, String>();
	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();

	}

	_02_LogSearch() {

		addEntry.addActionListener(this);
		searchByID.addActionListener(this);
		viewList.addActionListener(this);
	
		window.add(panel);
		panel.add(addEntry);
		panel.add(searchByID);
		panel.add(viewList);
		panel.add(removeEntry);
		addEntry.setText("Add Entry");
		searchByID.setText("Search By ID");
		viewList.setText("View List");
		removeEntry.setText("Remove Entry");
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==addEntry) {
		name = JOptionPane.showInputDialog("ENTER a Name");
		}
		if(e.getSource()==searchByID) {
		ID = JOptionPane.showInputDialog("ENTER an ID Number");
		}
		if(e.getSource()==viewList) {
		System.out.println("ID: " + ID + " Name: " + name);
		}
		if(e.getSource()==removeEntry) {
		remove = JOptionPane.showInputDialog("ENTER a ID to Delete");
		int remove2 = Integer.parseInt(remove);
		if(search.keySet().contains(remove2)) {
			search.remove(remove2);
		}else {
			System.out.println("ERROR :(");
		}
		
	}
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Howard Potts ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

}
