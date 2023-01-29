package Lab3;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Введіть ціле число =");
		if(sc.hasNextInt()) {
			int ch=sc.nextInt();
			System.out.print("Введіть цілу цифру, яку хочете видалити з числа =");
			if(sc.hasNextInt()) {
				int sumb=sc.nextInt();		
				System.out.println("Нове число : "+new_ch(ch, sumb));

			}else {
			System.out.println("Помилка. Ви ввели не ціле число!");
			}
		}else {
		System.out.println("Помилка. Ви ввели не ціле число!");
		}
	}
	public static int new_ch(int ch, int sumb) {
		String ch1=String.valueOf(ch);
		String sumb1=String.valueOf(sumb);
		ch1=ch1.replace(sumb1, "");
		ch=Integer.valueOf(ch1);
		return ch; 
	}
}
