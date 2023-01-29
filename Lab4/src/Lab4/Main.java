package Lab4;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
		//�������� ����
	MovieAbstract getAbstractMovie() {
        return
                new MovieAbstract() {
                    {
                        System.out.println("�������� ��������� �����");
                    }
                    
                    String ShowMovie() {
                        System.out.println("����� ShowMovie() �� ��������� �����");
                        return ("Number obj " + Movie.get_number());
                    }
					
                }; // ʳ���� ��������� �����
    }


	    public static void main(String[] args) throws CloneNotSupportedException {
	        //������� 3 ��'���� ����� Film
	    	Movie movie1 = new Movie("It",2018,"Warner Bros","Andres Muschietti");
	        Movie movie2 = new Movie("It 2",2019,"Warner Bros","Andres Muschietti");
	        Movie movie3 = new Movie("Time",2016,"Universal", "Adam Smith");

	        //������������ �������� ����. �������� ShowFilm(), ��� ��������� ������� ��������� ��'���� ����� Film, �������������� ��������� �����
	        Main main = new Main();
	        MovieAbstract AbsMov= main.getAbstractMovie();
	        System.out.println(AbsMov.ShowMovie());

	        //�������� ������� ���������� �����, ������������ ��� ����� ������� �������� ��������������� ������.
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

	        //������ ���������� ��� ������ ��������� ����� ������������ ��� ����� �������������� ����� toString().
	        System.out.println("\n"+movie1.toString());
	        System.out.println(movie2.toString());
	        System.out.println(movie3.toString());

	        System.out.println("\n"+movie1.ShowMovie());
	        System.out.println(movie2.ShowMovie());

	        //�������� ��� �ᒺ��� ����� �� ��������� ��������������� ������ equals() � ��������� ��������� ������� � �������
	        if(movie1.equals(movie2)){
	        	System.out.println("��'���� ���������");
	        	}
	        else {
	        	System.out.println("��'���� ���");
	        	};

	        //�������� ������ ��� �������� enum-����� TypeFilm �� ��� ��������� ����� ���������.
	        System.out.println("\n�� ����� ������: ");
	        for(TypeMovie t: TypeMovie.values())
	        {
	            System.out.println(t + " " + t.GetType());
	        }
	        TypeMovie[] t1 = TypeMovie.values();
	        System.out.println(Arrays.toString(t1));

	        //���������� ���� ������ �������������� ������ enum-����� TypeMovie.
	        movie1.setTypeMovie(TypeMovie.HORRORS);
	        movie2.setTypeMovie(TypeMovie.COMEDY);
	        movie3.setTypeMovie(TypeMovie.DETECTIVE);

	        //���������� ���� ������ ������� ��'���� ����� Film.
	        System.out.println("\n���� ������ " + movie1.get_name() + " " + movie1.GetTypeFilm() + " " + movie1.GetTypeFilm().GetType());
	        System.out.println("���� ������ " + movie2.get_name() + " " + movie2.GetTypeFilm() + " " + movie2.GetTypeFilm().GetType());
	        System.out.println("���� ������ " + movie3.get_name() + " " + movie3.GetTypeFilm() + " " + movie3.GetTypeFilm().GetType()+"\n");

	        //���������� ���������� �ᒺ��� �����.
	        Movie filmclone = (Movie) movie1.clone();
	        System.out.println("����: " + filmclone.ShowMovie()+"\n");
	        //�������� ��� �ᒺ��� ����� Film �������������� �������������� ����� compareTo()
	        if(movie1.compareTo(movie2)>0){
	        	System.out.println("movie1>movie2");
	        	}
	        else if(movie1.compareTo(movie2)<0){
	        	System.out.println("movie1<movie2");
	        	}
	        else{
	        	System.out.println("movie1=movie2");
	        }
	        
	        //����������� ����� enum-����� TypeFilm.
	        System.out.println("\nʳ������ ��'���� ����� Movie �������������� ����� enum-����� TypeMovie:" +movie1.GetCount()+"\n");
	        //����������� ����� ���������� �� ������ ���������
	        movie1.ClearMovie();
	        System.out.println("Գ��� 1: "+movie1.ShowMovie());
	}
}
