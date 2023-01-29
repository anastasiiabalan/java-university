package Lab2;
import java.util.Iterator;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Оголошення об'єктів класу
		Movie m1=new Movie();
		Movie m2=new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
		Movie m3=new Movie();
			
		//присвоєння об’єкту аргументів m1
		m1.set_name("It");
		m1.set_year(2020);
		m1.set_movie_studio("Warner Bros");
		m1.set_director("Andres Muschietti");
		
		//вивід на екран об’єктів
		m1.print_Movie();
		m2.print_Movie();
		m3.print_Movie();
		System.out.println("");
		
		//вивід на екран об’єктів верхнім регістром
		m1.print_Movie_Upper();
		m2.print_Movie_Upper();
		m3.print_Movie_Upper();
		
		//вивід на екран порядкових номерів об’єктів 
		System.out.println("\nФільм\t'"+m1.get_name()+"',\t порядковий номер "+m1.get_number());
		System.out.println("Фільм\t'"+m2.get_name()+"',\t порядковий номер "+m2.get_number());
		System.out.println("Фільм\t'"+m3.get_name()+"', порядковий номер "+m3.get_number());
		
		//Створененя масиву об’єктів

		Movie movies[]={m1,m2,m3};
		System.out.println("\nМасив: ");
	
		
		//вивід масиву
		for (int i = 0; i < movies.length; i++) {
			movies[i].print_Movie();	
		}
		
		
		System.out.println("\nКількість всіх обєктів ="+movies.length);

		
	}
}
