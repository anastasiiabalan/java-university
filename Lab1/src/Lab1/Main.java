package Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("������ ���� �����: ");
		a=sc.nextInt();
		double x;
		
		System.out.println("���������:");
		
		for (int i=0;i<10;i++) {
			try {
				x=a/i;	
				System.out.printf("���� "+i+", x="+x+"\n");
			}catch (java.lang.ArithmeticException e) {
				System.out.println("ĳ����� �� 0");

			}
			
		}
		

	}

}
