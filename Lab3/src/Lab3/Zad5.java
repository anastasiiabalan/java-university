package Lab3;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("������ ���� ����� =");
		if(sc.hasNextInt()) {
			int ch=sc.nextInt();
			System.out.print("������ ���� �����, ��� ������ �������� � ����� =");
			if(sc.hasNextInt()) {
				int sumb=sc.nextInt();		
				System.out.println("���� ����� : "+new_ch(ch, sumb));

			}else {
			System.out.println("�������. �� ����� �� ���� �����!");
			}
		}else {
		System.out.println("�������. �� ����� �� ���� �����!");
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
