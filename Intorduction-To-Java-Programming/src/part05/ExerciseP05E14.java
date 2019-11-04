package part05;

import java.util.Scanner;

public class ExerciseP05E14 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int count,n1,n2;
		System.out.print("Birinci sayiyi giriniz : ");
		n1 = var.nextInt();
		System.out.print("Ikinci sayiyi giriniz :");
		n2 = var.nextInt();
		if (n2>n1) {
			count=n1;
		}else {
			count=n2;
		}
		for (int i = count ; i>0 ;i--) {
			if (n2%i==0 && n1%i==0) {
				System.out.println("En buyuk ortak bolen " + i + " dir");
				break;
			}
		}
		var.close();
	}

}
