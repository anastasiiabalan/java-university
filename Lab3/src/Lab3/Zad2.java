package Lab3;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {       
		Scanner sc=new Scanner(System.in);
		double a=0,b=0,c=0; 
		
		System.out.print("������ 1 ������� ����� : ");
		if(sc.hasNextDouble()) {
			a=sc.nextDouble();
			System.out.print("������ 2 ������� ����� : ");
		
			if(sc.hasNextDouble()) {
				b=sc.nextDouble();
				System.out.print("������ 3 ������� ����� : ");
				
				if(sc.hasNextDouble()) {
					c=sc.nextDouble();
					
				}else {
					System.out.println("�������. �� ����� �� ������� �����!");
				}

			}else {
				System.out.println("�������. �� ����� �� ������� �����!");
			}

		}else {
			System.out.println("�������. �� ����� �� ������� �����!");
		}
		
		double min=0;
		if(min_abs(a,b,c)<0) {
			System.out.println("�������� ������� ����� = "+min_abs(a,b,c)+", �� ������ = "+Math.abs(min_abs(a,b,c)));
		}else {
			System.out.println("�������� ������� ����� = "+min_abs(a,b,c));
		}


		
	}
	public static double min_abs(double a, double b, double c) {
		double a1=Math.abs(a);
		double b1=Math.abs(b);
		double c1=Math.abs(c);
		
		double min=0;

		if(a1<=b1 & a1<=c1) {
			min=a;
		}else if(b1<=a1 & b1<=c1){
			min=b;
		}else if(c1<a1 & c1<=b1){
			min=c;
		}	
		return 	min;
	}
}


