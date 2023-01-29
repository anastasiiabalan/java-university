package Lab3;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System. in);
		System.out.println("Введіть ціле число :");
		if(sc.hasNextInt()) {
			int n=sc.nextInt();
			System.out.println("Сума = "+sum(n));
		}else {
			System.out.println("Помилка. Ви ввели не ціле число!");
			}
	}
	public static int sum(int n) {
		int n1=0;
		int sum=0;
		int dob=1;
		for(int i=1;i<=n;i++) {
			n1=i;
			dob=1;
			while(n1<=2*i) {
				dob=dob*n1;
				n1++;
			}
			sum=sum+dob;
		}		 
		return sum;
	}
}