package labThree;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class problemTwoHighestInteger {

	public static void main(String[] args) {
		int indexInputInt = 0;
		ArrayList<Integer> takenInputs = new ArrayList<Integer>();
		for (int i = 0; i < 20 && indexInputInt != -1; i++) {
			int counterI = i + 1;
			String indexInput = JOptionPane.showInputDialog("Please type your " + counterI + " integer: ");
			indexInputInt = Integer.parseInt(indexInput);
			takenInputs.add(indexInputInt);

		}
		System.out.println(takenInputs);
		takenInputs.sort(null);
		int largestNumber = takenInputs.get(takenInputs.size()-1);
		System.out.print("The largest number is " + largestNumber);
	}
}
