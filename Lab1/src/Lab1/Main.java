package Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Введіть ціле число: ");
		a=sc.nextInt();
		double x;
		
		System.out.println("Результат:");
		
		for (int i=0;i<10;i++) {
			try {
				x=a/i;	
				System.out.printf("Крок "+i+", x="+x+"\n");
			}catch (java.lang.ArithmeticException e) {
				System.out.println("Ділення на 0");

			}
			
		}
		

	}

}
