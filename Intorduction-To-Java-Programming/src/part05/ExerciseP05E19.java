package part05;

public class ExerciseP05E19 {
	public static void main(String[] args) {
		for(int i=1; i<=8; i++) {
			for (int j=8; j>=i; j--) {
				System.out.printf("%6s","");
			}
			for (int k=0; k<i; k++) {
				System.out.printf("%-6d",(int) (Math.pow(2, k)));
			}
			for (int l=i-1; l>=1; l--) {
				System.out.printf("%-6d",(int) (Math.pow(2, l-1)));
			}
			System.out.println();
		}
	}

}
