package labThree;

import javax.swing.JOptionPane;
import java.util.ArrayList;
//next time just create an array with size n rather than using arrayList as to make the code cleaner
public class problemOneLoops {
	public static void main(String args[]) {
		int sum = 0; //next time init in when used rather than outside
		ArrayList<Integer> takenInputs = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int counterI = i + 1;
			String indexInput = JOptionPane.showInputDialog("Please type your " + counterI + " integer: ");
			int indexInputInt = Integer.parseInt(indexInput);
			takenInputs.add(indexInputInt);
		}
		for (int i = 0; i < 10; i++) {
			sum = sum + takenInputs.get(i);
			int averageOverall = sum / takenInputs.size();
			if (i == 9) {
				System.out.println(averageOverall);
				System.exit(0);
			}
		}

	}
}
