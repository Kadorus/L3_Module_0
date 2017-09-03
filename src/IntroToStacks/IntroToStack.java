package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack1 = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random random1 = new Random();
		for(int i = 0; i < 100; i++){
			stack1.push(random1.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String number1 = JOptionPane.showInputDialog("Type a number between 0 and 100");
		String number2 = JOptionPane.showInputDialog("Type a second, smaller number between 0 and 100");
		double bound1 = Double.parseDouble(number1);
		double bound2 = Double.parseDouble(number2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for(int i = 0; i < 100; i++){
			double popped = stack1.pop();
			if(popped < bound1 && popped > bound2){
				System.out.println(popped);
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
