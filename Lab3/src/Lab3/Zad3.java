package Lab3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введіть слово, яке складається з 5 букв");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String text2="";
		int k_similar=0;
		

		if(text.length()==5) {
			for (int i = 0; i < text.length(); i++) {
				text2=text.charAt(i)+text2;
			}
		}else {
			System.out.println("Ви ввели слово, кількість символів якого НЕ дорівнює 5");
		}
		
		
		if(text.equalsIgnoreCase(text2)) {
			System.out.println("Дане слово є паліндромом: "+text2);
		}else {
			System.out.println("Дане слово НЕ є паліндромом: "+text2);
		}	
	}
}
