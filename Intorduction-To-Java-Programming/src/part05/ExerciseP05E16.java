package part05;

import java.util.Scanner;

public class ExerciseP05E16 {
	public static void main(String[] args) {
		int var ;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Carpanlari bulunacak sayiyi giriniz : ");
		var = sc.nextInt();
		for (int i = 2 ; i<=var; ) {
			if (var%i==0) {
				System.out.printf("%d ",i);
				var /= i;
			}else {
				i++;
			}
		}
		sc.close();
	}
}
