package Lab9;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ����� : ");
		try {
			String text=sc.nextLine();
            System.out.println("�������� 1 ������ : "+text.charAt(0));
        }
        catch(StringIndexOutOfBoundsException e) {
        	  System.out.println("���, �� ������ ������ �������� (NullPointerException)");
        }
        finally {
			System.out.println("��������� �� ���");	
		}
	}
}
