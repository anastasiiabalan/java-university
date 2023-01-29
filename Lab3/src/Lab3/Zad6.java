package Lab3;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		System.out.println("Введіть кількість простих чисел(не більше 500) k=");
		Scanner sc=new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			int input_ch=sc.nextInt();
			int k=0;
			int k_pros=0;
			System.out.println("Прості числа :");
			for(int i=2;i<=1000;i++) {
				k=0;
				for (int j = 2; j<=1000; j++) {
					if((i%2!=0 & i%j!=0 & k==0) | (i==2 & k==0)) {
						k=1;
						if(input_ch>k_pros) {
							System.out.print(i+" ");
							k_pros++;
							}
						}
					}	
				}
			}else {
				System.out.println("Помилка. Ви ввели не ціле число!");
			}	
	}
}
