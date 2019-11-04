package part05;

public class ExerciseP05E23 {
	public static void main(String[] args) {
		double countLeftAndRight = 1;
		for (double i=1; i<=50000; i++) {
			countLeftAndRight = countLeftAndRight + (1/i);
		}
		double countRightAndLeft = 0;
		for (double i=50000; i>=1; i--) {
			countRightAndLeft = countRightAndLeft + (1/i);
		}
		
		System.out.println(countLeftAndRight + "    " +countRightAndLeft );
	}

}
