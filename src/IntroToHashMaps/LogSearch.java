package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After
	 * an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */

	public static void main(String[] args) {
		LogSearch logSearch1 = new LogSearch();
	}

	HashMap<Integer, String> dog = new HashMap<Integer, String>();
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");

	LogSearch() {
		frame1.setSize(500, 500);
		frame1.setVisible(true);
		frame1.add(panel1);
		panel1.setSize(500, 500);
		panel1.setVisible(true);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		button1.setSize(100, 50);
		button2.setSize(100, 50);
		button3.setSize(100, 50);
		button4.setSize(100, 50);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame1.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String numberID = JOptionPane.showInputDialog("Enter an ID number.");
			Integer id = Integer.parseInt(numberID);
			String name = JOptionPane.showInputDialog(null, "Enter a name.");
			dog.put(id, name);
		}
		if (e.getSource() == button2) {
			String numberID = JOptionPane.showInputDialog("Enter an ID number.");
			Integer id = Integer.parseInt(numberID);
			if (dog.containsKey(id)) {
				JOptionPane.showMessageDialog(null, dog.get(id));
			} else {
				JOptionPane.showMessageDialog(null, "Name does not exist.");
			}
		}
		if (e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, dog.toString());
		}
		if (e.getSource() == button4) {
			String name = JOptionPane.showInputDialog(null, "Enter an ID to remove.");
			Integer removal = Integer.parseInt(name);
			if (dog.containsKey(removal)) {
				dog.remove(removal);
			} else {
				JOptionPane.showMessageDialog(null, "That ID does not exist.");
			}
		}
	}
}
