package labThree;

import java.util.ArrayList;

import javax.swing.JOptionPane;
//next time just create an array with size n rather than using arrayList as to make the code cleaner
public class problemThreeSkippingNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> takenInputs = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			int counterI = i + 1;
			String indexInput = JOptionPane.showInputDialog("Please type your " + counterI + " integer: ");
			int indexInputInt = Integer.parseInt(indexInput);
			takenInputs.add(indexInputInt);
			if (indexInputInt == 2 || indexInputInt == 7 || indexInputInt == 10) {
				continue;
			}
			System.out.println("The (" + counterI + ") input is " + takenInputs.get(i));
		}
		System.exit(0);
	}

}
