package Lab2;
import java.util.Iterator;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//���������� ��'���� �����
		Movie m1=new Movie();
		Movie m2=new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
		Movie m3=new Movie();
			
		//��������� �ᒺ��� ��������� m1
		m1.set_name("It");
		m1.set_year(2020);
		m1.set_movie_studio("Warner Bros");
		m1.set_director("Andres Muschietti");
		
		//���� �� ����� �ᒺ���
		m1.print_Movie();
		m2.print_Movie();
		m3.print_Movie();
		System.out.println("");
		
		//���� �� ����� �ᒺ��� ������ ��������
		m1.print_Movie_Upper();
		m2.print_Movie_Upper();
		m3.print_Movie_Upper();
		
		//���� �� ����� ���������� ������ �ᒺ��� 
		System.out.println("\nԳ���\t'"+m1.get_name()+"',\t ���������� ����� "+m1.get_number());
		System.out.println("Գ���\t'"+m2.get_name()+"',\t ���������� ����� "+m2.get_number());
		System.out.println("Գ���\t'"+m3.get_name()+"', ���������� ����� "+m3.get_number());
		
		//���������� ������ �ᒺ���

		Movie movies[]={m1,m2,m3};
		System.out.println("\n�����: ");
	
		
		//���� ������
		for (int i = 0; i < movies.length; i++) {
			movies[i].print_Movie();	
		}
		
		
		System.out.println("\nʳ������ ��� ����� ="+movies.length);

		
	}
}
