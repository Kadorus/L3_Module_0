package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> aList1 = new ArrayList<String>();
	
	public static void main(String args[]){
		GuestBook book1 = new GuestBook();
	}
	
	GuestBook(){
		frame1.setSize(500, 500);
		frame1.setVisible(true);
		frame1.add(panel1);
		panel1.setSize(500, 500);
		panel1.setVisible(true);
		panel1.add(button1);
		panel1.add(button2);
		button1.setSize(100, 50);
		button1.setSize(100, 50);
		button1.setVisible(true);
		button1.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame1.pack();
	}	
	
	  public void actionPerformed(ActionEvent e){
		 if(e.getSource() == button1){
			 String name1 = JOptionPane.showInputDialog("Enter a name.");
			 aList1.add(name1);
		 }
		 if(e.getSource() == button2){
			JOptionPane.showMessageDialog(null, aList1.toString());
		 }
	  }	
}