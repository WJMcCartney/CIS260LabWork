import java.util.Scanner;
import java.util.ArrayList;

public class problemTwoAnagrams {
	public static void main(String[] Args) {
		ArrayList<Character> comparativeWordList = new ArrayList<Character>();
		ArrayList<Character> anagramWordList = new ArrayList<Character>();
		Scanner input = new Scanner(System.in);
		int isAnagram = 0;
		int notAnagram = 0;
		System.out.print("Enter a word here: ");
		String anagramWordUntrimmed = input.nextLine();
		System.out.print("Print the word(s) you think might fit into that word: ");
		String comparativeWordUntrimmed = input.nextLine();
		String anagramWord = anagramWordUntrimmed.trim();
		String comparativeWord = comparativeWordUntrimmed.trim();
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
		for (int i = 0; i < comparativeWordList.size() && i < anagramWordList.size(); i += 1) {
			char currentComparativeLetterChar = comparativeWordList.get(i);
			char currentAnagramWordChar = anagramWordList.get(i);
			String currentComparativeLetter = Character.toString(currentComparativeLetterChar);
			String currentAnagramWord = Character.toString(currentAnagramWordChar);
			if (currentComparativeLetter.equalsIgnoreCase(currentAnagramWord)) {
				isAnagram += 1;
			} else {
				notAnagram += 1;
			}

		}
		System.out.println("there are " + isAnagram + " letters that are matching and there are " + notAnagram
				+ " letters that are not matching.");
		if (isAnagram > notAnagram) {
			System.out.println("The word " + anagramWord + " is an anagram in comparison to " + comparativeWord);
		} else {
			System.out.println("The word " + anagramWord + " is not an anagram in comparison to " + comparativeWord);
		}
	}
}
