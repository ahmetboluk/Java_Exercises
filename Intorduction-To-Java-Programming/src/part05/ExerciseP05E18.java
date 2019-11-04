package part05;

public class ExerciseP05E18 {
	public static void main(String[] args) {
		System.out.println("Pattern A \n");
		for (int i=1; i<=6; i++) {
			for (int k=1; k<=i; k++ ) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern B \n");
		for (int i=6; i>=1; i--) {
			for (int k=1; i>=k; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("Pattern C \n");
		for (int i=1; i<=6; i++) {
			for (int k = 6-i; k>=1; k--) {
				System.out.print(" ");
			}
			for (int j = i; j>0; j--  ) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern F \n");
		for (int i=6; i>0; i--) {
			for (int k = 1; k<i; k++) {
				System.out.print(" ");
			}
			for (int j = 6; j>i-1; j--  ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
