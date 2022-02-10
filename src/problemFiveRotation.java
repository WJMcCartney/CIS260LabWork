import javax.swing.JOptionPane;

public class problemFiveRotation {

	public static void main(String[] args) {
		String firstWord = JOptionPane.showInputDialog("Enter the first word: ");
		String secondWord = JOptionPane.showInputDialog("Enter the second word: ");

		StringBuffer firstWordBuffer = new StringBuffer(firstWord);
		System.out.println(firstWordBuffer);
		if (firstWordBuffer.length() != secondWord.length()) {
		} else {
			String concatFirstWord = firstWord.concat(firstWord);
			if (concatFirstWord.indexOf(secondWord) > 0) {
				System.out.println("The word " + secondWord + " is a rotation of " + firstWord);
			} else {
				System.out.println("The word " + secondWord + " is not a rotation of " + firstWord);
			}
		}
	}

}
