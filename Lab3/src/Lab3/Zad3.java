package Lab3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �����, ��� ���������� � 5 ����");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String text2="";
		int k_similar=0;
		

		if(text.length()==5) {
			for (int i = 0; i < text.length(); i++) {
				text2=text.charAt(i)+text2;
			}
		}else {
			System.out.println("�� ����� �����, ������� ������� ����� �� ������� 5");
		}
		
		
		if(text.equalsIgnoreCase(text2)) {
			System.out.println("���� ����� � ����������: "+text2);
		}else {
			System.out.println("���� ����� �� � ����������: "+text2);
		}	
	}
}
