package labThree;

public class problemFourInterestOverTime {

	public static void main(String[] args) {
		double startingPoint = 100;
		for (int i=0;i<10;i++) {
			int counterI = i+1;
			double interestCountableNumber = startingPoint + (startingPoint - 1)*.02;
			String printableNumber = String.valueOf(interestCountableNumber);
			System.out.printf("%7.7s %1.100s", "\n"+printableNumber, "is the amount of money you have in " + counterI + " year(s)!");
			startingPoint = interestCountableNumber;
		}

	}

}
