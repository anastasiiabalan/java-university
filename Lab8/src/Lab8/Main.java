package Lab8;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ����� : ");
		String text=sc.nextLine();
		
		System.out.print("������ ����� �����, ��� ������ ������� : ");
		int k_letter=sc.nextInt();
		
		System.out.print("������ ������, �� ���� ������ ������� : ");
		String letter=sc.next();
		
		String []word=text.trim().split("\\s+");
		
		for (int i = 0; i < word.length; i++) {
			if(word[i].length()>k_letter ) {	
				sb.append(word[i].substring(0,k_letter-1)).append(letter).append(word[i].substring(k_letter));

			}
			else {
				sb.append(word[i]);
			}
			sb.append(" ");
		}
		System.out.println("Finally text :");
			System.out.print(sb.toString());		
	}
}
