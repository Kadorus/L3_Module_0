package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TextUndoRedo implements KeyListener {
	
	
	//ㅔ두ㅑㄴ ㅗ돋 ㅌ
	
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel();
	ArrayList<String> aList1 = new ArrayList<String>();
	Stack<String> undoStack = new Stack<String>();
	String aListString = "";
	
	TextUndoRedo(){
	frame1.add(panel1);
	frame1.setSize(5000, 50);
	frame1.setVisible(true);
	frame1.addKeyListener(this);
	panel1.add(label1);
	panel1.setSize(5000, 50);
	panel1.setVisible(true);
	label1.setSize(5000, 50);
	label1.setVisible(true);
	}
	
	public static void main(String[] args) {
		TextUndoRedo TextUndoRedo1 = new TextUndoRedo();
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == 8) {
			undoStack.push(aList1.get(aList1.size() - 1));
			aList1.remove(aList1.size() - 1);
			for(int i = 0; i < aList1.size(); i++){
				aListString += aList1.get(i);
			}
			label1.setText(aListString);
			aListString = "";
		}
		else if(e.getKeyCode() == 32){
			aList1.add(" ");
			for(int i = 0; i < aList1.size(); i++){
				aListString += aList1.get(i);
			}
			label1.setText(aListString);
			aListString = "";
		}
		else if(e.getKeyCode() == 37){
			aList1.add(undoStack.pop());
			for(int i = 0; i < aList1.size(); i++){
				aListString += aList1.get(i);
			}
			label1.setText(aListString);
			aListString = "";
		}
		else {
			aList1.add(KeyEvent.getKeyText(e.getKeyCode()));;
			for(int i = 0; i < aList1.size(); i++){
				aListString += aList1.get(i);
			}
			label1.setText(aListString);
			aListString = "";
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
