package Lab4;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
		//анонімний клас
	MovieAbstract getAbstractMovie() {
        return
                new MovieAbstract() {
                    {
                        System.out.println("Всередині анонімного класу");
                    }
                    
                    String ShowMovie() {
                        System.out.println("Метод ShowMovie() із анонімного класу");
                        return ("Number obj " + Movie.get_number());
                    }
					
                }; // Кінець анонімного класу
    }


	    public static void main(String[] args) throws CloneNotSupportedException {
	        //створюю 3 об'єкта класу Film
	    	Movie movie1 = new Movie("It",2018,"Warner Bros","Andres Muschietti");
	        Movie movie2 = new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
	        Movie movie3 = new Movie("Time",2016,"Universal", "Adam Smith");

	        //використовую анонімний клас. Викликаю ShowFilm(), для виведення кількості створених об'єктів класу Film, використовуючи статичний метод
	        Main main = new Main();
	        MovieAbstract AbsMov= main.getAbstractMovie();
	        System.out.println(AbsMov.ShowMovie());

	        //Створити декілька екземплярів класу, використавши для цього механізм динамічної диспетчеризації методів.
	        MovieAbstract obj;
	        obj = movie1;
	        System.out.println("\n"+obj.ShowMovie());
	        obj = movie2;
	        System.out.println(obj.ShowMovie());
	        obj = movie3;
	        System.out.println(obj.ShowMovie());

	        System.out.println("\n"+movie1.ShowMovie());
	        IMovie inter;
	        inter = movie1;
	        inter.Rename("New Movie");

	        //Вивела інформацію про кожний екземпляр класу використавши для цього перевизначений метод toString().
	        System.out.println("\n"+movie1.toString());
	        System.out.println(movie2.toString());
	        System.out.println(movie3.toString());

	        System.out.println("\n"+movie1.ShowMovie());
	        System.out.println(movie2.ShowMovie());

	        //Порівняла два об’єкти класу за допомогою перевизначеного методу equals() і результат порівняння вивести в консоль
	        if(movie1.equals(movie2)){
	        	System.out.println("Об'єкти рівнозначні");
	        	}
	        else {
	        	System.out.println("Об'єкти різні");
	        	};

	        //Отримати список всіх елементів enum-класу TypeFilm під час виконання двома способами.
	        System.out.println("\nУсі жанри фільмів: ");
	        for(TypeMovie t: TypeMovie.values())
	        {
	            System.out.println(t + " " + t.GetType());
	        }
	        TypeMovie[] t1 = TypeMovie.values();
	        System.out.println(Arrays.toString(t1));

	        //Встановила жанр фільму використовуючи методи enum-класу TypeMovie.
	        movie1.setTypeMovie(TypeMovie.HORRORS);
	        movie2.setTypeMovie(TypeMovie.COMEDY);
	        movie3.setTypeMovie(TypeMovie.DETECTIVE);

	        //Встановила жанр фільму кожного об'єкту класу Film.
	        System.out.println("\nЖанр фільму " + movie1.get_name() + " " + movie1.GetTypeFilm() + " " + movie1.GetTypeFilm().GetType());
	        System.out.println("Жанр фільму " + movie2.get_name() + " " + movie2.GetTypeFilm() + " " + movie2.GetTypeFilm().GetType());
	        System.out.println("Жанр фільму " + movie3.get_name() + " " + movie3.GetTypeFilm() + " " + movie3.GetTypeFilm().GetType()+"\n");

	        //Здійсненила клонування об’єкту класу.
	        Movie filmclone = (Movie) movie1.clone();
	        System.out.println("Клон: " + filmclone.ShowMovie()+"\n");
	        //Порівняла два об’єктів класу Film використовуючи перевизначений метод compareTo()
	        if(movie1.compareTo(movie2)>0){
	        	System.out.println("movie1>movie2");
	        	}
	        else if(movie1.compareTo(movie2)<0){
	        	System.out.println("movie1<movie2");
	        	}
	        else{
	        	System.out.println("movie1=movie2");
	        }
	        
	        //Використала метод enum-класу TypeFilm.
	        System.out.println("\nКількість об'єктів класу Movie використовуючи метод enum-класу TypeMovie:" +movie1.GetCount()+"\n");
	        //Використала метод інтерфейсу та вивела результат
	        movie1.ClearMovie();
	        System.out.println("Фільм 1: "+movie1.ShowMovie());
	}
}
