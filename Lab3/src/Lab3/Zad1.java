package Lab3;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ���� �����: ");

		if(sc.hasNextInt()) {
			a=sc.nextInt();
			if(a%2==0) {
				System.out.println("ֳ�� ����� � �����");
			}else {
				System.out.println("ֳ�� ����� �� � �����");
			}
		}else {
			System.out.println("�������. �� ����� �� ���� �����!");
		}

	}
}
