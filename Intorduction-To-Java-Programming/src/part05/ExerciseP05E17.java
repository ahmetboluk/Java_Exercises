package part05;

import java.util.Scanner;

public class ExerciseP05E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfLines;
		System.out.print("Enter the number of lines : ");
		numberOfLines = input.nextInt();
		while (numberOfLines < 1 || numberOfLines > 15) {
			System.out.println("Invalid input");
			System.out.print("Enter the number of lines : ");
			numberOfLines = input.nextInt();
		}
		for (int i = 1; i<=numberOfLines; i++) {
			for (int j = numberOfLines ; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k>1; k--) {
				System.out.print(k);
			}
			for (int l = 1; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		input.close();
	}
}
