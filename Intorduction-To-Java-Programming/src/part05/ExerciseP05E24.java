package part05;

public class ExerciseP05E24 {
	public static void main(String[] args) {
		double count =0;
		for (double i=1; i<98; i++) {
			count += i/(i+2);
		}
		System.out.println(count);
	}

}
