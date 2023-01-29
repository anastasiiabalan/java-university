package Lab3;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Введіть ціле число: ");

		if(sc.hasNextInt()) {
			a=sc.nextInt();
			if(a%2==0) {
				System.out.println("Ціле число є парне");
			}else {
				System.out.println("Ціле число не є парне");
			}
		}else {
			System.out.println("Помилка. Ви ввели не ціле число!");
		}

	}
}
