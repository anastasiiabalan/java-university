package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		//створення колекції ArrayList
		ArrayList<Movie> movie_list=new ArrayList<Movie>();
		
		//Створення і додавання елементів в колекцію
		Movie m1=new Movie("It",2020,"Warner Bros","Andres Muschietti");
		Movie m2=new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
		
		movie_list.add(m1);
		movie_list.add(m2);
		
		//Отимання інформації про обєкт за допомогою перевизначеного методу toString
		System.out.println("Array List: ");
		for (Movie movie : movie_list) {
			System.out.println(movie.toString());
		}
		//створення елементу класу Movie
		Movie m3=new Movie("Грінч — що вкрав Різдво",2000,"Universal ","Рон Говард");	
		//видалення елементу колекці
		movie_list.remove(m1);
		//модифікація елементу колекції
		m2.set_movie_studio("20th Century");
		//додавання елементу в колекцію
		movie_list.add(m3);
		
		//Отимання оновленої інформації про обєкт за допомогою перевизначеного методу toString
		System.out.println("\nNew array List: ");
		for (Movie movie : movie_list) {
			System.out.println(movie);
		}


        // Створення enum-карти
        EnumMap<TypeMovie, Movie> movie_map = new EnumMap<TypeMovie, Movie>(TypeMovie.class);

        // Додавання елементів у enum-карту
        movie_map.put(TypeMovie.HORRORS, new Movie ("YOU",2018,"Netflix","Harry Jedjuman"));
        movie_map.put(TypeMovie.COMEDY, new Movie("Mask",1994," New Line Cinema","Chack Rassel"));
        movie_map.put(TypeMovie.DETECTIVE, new Movie ("In time",2011,"Warner Bros","Endry Nikol"));


        // Представлення карти у вигляді колекції
        Set<Map.Entry<TypeMovie, Movie>> set = movie_map.entrySet();

        // Виведення інформації про елементи карти за допомогою циклу for у стилі «for-each»
        System.out.println("\nEnumMap movie2:");
        for(Map.Entry<TypeMovie, Movie> obj : set) {
            System.out.print(" " + obj.getKey() + " -> ");
            System.out.println(obj.getValue());
        }

        // Модифікація карти
        Movie m =  movie_map.get(TypeMovie.COMEDY);
        m.set_director("Vahn Jogh");      //зміна параметру елемента


        // Виведення інформації про елементи модифікованої карти за допомогою циклу for у стилі «for-each»
        System.out.println("\nEnumMap movie2 modified:");
        for(Map.Entry<TypeMovie, Movie> obj : set) {
            System.out.print(" " + obj.getKey() + " -> ");
            System.out.println(obj.getValue());
        }
        System.out.println();
	}
}
