import java.util.Scanner;
import java.util.ArrayList;

public class problemTwoAnagrams {
	public static void main(String[] Args) {
		ArrayList<Character> comparativeWordList = new ArrayList<Character>();
		ArrayList<Character> anagramWordList = new ArrayList<Character>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word here: ");
		String anagramWord = input.nextLine();
		System.out.print("Print the word(s) you think might fit into that word: ");
		String comparativeWord = input.nextLine();
		input.close();
		char[] anagramWordListUntrimmed = anagramWord.toCharArray();
		char[] comparativeWordListUntrimmed = comparativeWord.toCharArray();
		for (int i = 0; i < anagramWordListUntrimmed.length; i += 1) {
			char originalAnLetter = anagramWordListUntrimmed[i];
			String originalAnLetterStr = Character.toString(originalAnLetter);
			if (originalAnLetterStr.equals(" ") || originalAnLetterStr.equals(".") || originalAnLetterStr.equals(",")
					|| originalAnLetterStr.equals("?") || originalAnLetterStr.equals("!")
					|| originalAnLetterStr.equals("(") || originalAnLetterStr.equals(")")
					|| originalAnLetterStr.equals("<") || originalAnLetterStr.equals(">")
					|| originalAnLetterStr.equals(":") || originalAnLetterStr.equals(";")
					|| originalAnLetterStr.equals("'") || originalAnLetterStr.equals("{")
					|| originalAnLetterStr.equals("}") || originalAnLetterStr.equals("|")
					|| originalAnLetterStr.equals("\\") || originalAnLetterStr.equals("\"")) {

			} else {
				anagramWordList.add(originalAnLetter);
			}
		}
		for (int i = 0; i < comparativeWordListUntrimmed.length; i += 1) {
			char originalAnLetter = comparativeWordListUntrimmed[i];
			String originalAnLetterStr = Character.toString(originalAnLetter);
			if (originalAnLetterStr.equals(" ") || originalAnLetterStr.equals(".") || originalAnLetterStr.equals(",")
					|| originalAnLetterStr.equals("?") || originalAnLetterStr.equals("!")
					|| originalAnLetterStr.equals("(") || originalAnLetterStr.equals(")")
					|| originalAnLetterStr.equals("<") || originalAnLetterStr.equals(">")
					|| originalAnLetterStr.equals(":") || originalAnLetterStr.equals(";")
					|| originalAnLetterStr.equals("'") || originalAnLetterStr.equals("{")
					|| originalAnLetterStr.equals("}") || originalAnLetterStr.equals("|")
					|| originalAnLetterStr.equals("\\") || originalAnLetterStr.equals("\"")) {
			} else {
				comparativeWordList.add(originalAnLetter);
			}
		}
		if (comparativeWordList.size() == anagramWordList.size()) {
			for (int i = 0; i < comparativeWordList.size(); i += 1) {
				char currentComparativeLetterChar = comparativeWordList.get(i);
				int comparativeIndexMatch = anagramWordList.indexOf(currentComparativeLetterChar);
				System.out.println(comparativeIndexMatch);
				if (comparativeIndexMatch != -1) {
					anagramWordList.remove(comparativeIndexMatch);
				} else {
					System.out.println("The word " + anagramWord + " and the word " + comparativeWord
							+ " is not an anagram because the letter " + currentComparativeLetterChar
							+ " is not in the original word the same amount of times"
							+ " \nthat it shows up in the comparative word(s).");
					System.exit(0);
				}
			}
		} else {
			System.out.println("The word " + anagramWord + " and the word " + comparativeWord
					+ " is not an anagram because they are not the same length.");
			System.exit(0);
		}
		System.out.println("The word " + anagramWord + " is an anagram in comparison to " + comparativeWord
				+ " while ignoring white space.");
	}
}
