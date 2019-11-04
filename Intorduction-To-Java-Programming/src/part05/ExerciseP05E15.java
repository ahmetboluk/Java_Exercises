package part05;

public class ExerciseP05E15 {
	public static void main(String[] args) {
		
		for (char i = '!' ; i <= '~'; i++) {
			System.out.printf("%c ",i);
			if(i % 10 == 2) System.out.println();  
		}
	}

}
