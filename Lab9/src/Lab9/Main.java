package Lab9;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Введіть текст : ");
		try {
			String text=sc.nextLine();
            System.out.println("Введений 1 символ : "+text.charAt(0));
        }
        catch(StringIndexOutOfBoundsException e) {
        	  System.out.println("Упс, ви вввели порожнє значення (NullPointerException)");
        }
        finally {
			System.out.println("Спробуйте ще раз");	
		}
	}
}
