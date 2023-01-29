package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		//��������� �������� ArrayList
		ArrayList<Movie> movie_list=new ArrayList<Movie>();
		
		//��������� � ��������� �������� � ��������
		Movie m1=new Movie("It",2020,"Warner Bros","Andres Muschietti");
		Movie m2=new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
		
		movie_list.add(m1);
		movie_list.add(m2);
		
		//�������� ���������� ��� ���� �� ��������� ��������������� ������ toString
		System.out.println("Array List: ");
		for (Movie movie : movie_list) {
			System.out.println(movie.toString());
		}
		//��������� �������� ����� Movie
		Movie m3=new Movie("���� � �� ����� г����",2000,"Universal ","��� ������");	
		//��������� �������� �������
		movie_list.remove(m1);
		//����������� �������� ��������
		m2.set_movie_studio("20th Century");
		//��������� �������� � ��������
		movie_list.add(m3);
		
		//�������� �������� ���������� ��� ���� �� ��������� ��������������� ������ toString
		System.out.println("\nNew array List: ");
		for (Movie movie : movie_list) {
			System.out.println(movie);
		}


        // ��������� enum-�����
        EnumMap<TypeMovie, Movie> movie_map = new EnumMap<TypeMovie, Movie>(TypeMovie.class);

        // ��������� �������� � enum-�����
        movie_map.put(TypeMovie.HORRORS, new Movie ("YOU",2018,"Netflix","Harry Jedjuman"));
        movie_map.put(TypeMovie.COMEDY, new Movie("Mask",1994," New Line Cinema","Chack Rassel"));
        movie_map.put(TypeMovie.DETECTIVE, new Movie ("In time",2011,"Warner Bros","Endry Nikol"));


        // ������������� ����� � ������ ��������
        Set<Map.Entry<TypeMovie, Movie>> set = movie_map.entrySet();

        // ��������� ���������� ��� �������� ����� �� ��������� ����� for � ���� �for-each�
        System.out.println("\nEnumMap movie2:");
        for(Map.Entry<TypeMovie, Movie> obj : set) {
            System.out.print(" " + obj.getKey() + " -> ");
            System.out.println(obj.getValue());
        }

        // ����������� �����
        Movie m =  movie_map.get(TypeMovie.COMEDY);
        m.set_director("Vahn Jogh");      //���� ��������� ��������


        // ��������� ���������� ��� �������� ������������ ����� �� ��������� ����� for � ���� �for-each�
        System.out.println("\nEnumMap movie2 modified:");
        for(Map.Entry<TypeMovie, Movie> obj : set) {
            System.out.print(" " + obj.getKey() + " -> ");
            System.out.println(obj.getValue());
        }
        System.out.println();
	}
}
