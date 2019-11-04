package part05;

public class ExerciseP05E20 {
	public static void main(String[] args) {
		int count=0;
		int lineConut=0;
		for(int i=2; i<=1000; i++) {
			count=0;
			for (int j=2; j<=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if(count<2) {
				System.out.printf("%6s",i);
				lineConut++;
				if(lineConut==8) {
					System.out.println();
					lineConut=0;
				}
			}
		}
	}

}
