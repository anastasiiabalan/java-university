package Lab4;

public class Movie extends MovieAbstract implements IMovie, Cloneable, Comparable <Movie>  {
	// перерахування змінних класу
    
    private String name;
	private int year;
	private String movie_studio;
	private String director;

	String print_name="Назва фільму";
	String print_year="рік випуску";
	String print_studio="кіностудія";
	String print_director="режисер";
	String result="";
    
    private TypeMovie typef;

    
    // створення змінної для збереження порядкового номеру екземпляру класу
    private int id;

    public Movie() {
        this.id = ++number;
    }   
    
	public Movie(String name, int year, String movie_studio, String director){//конструктор класу з параметрами
		this.name=name;
		this.year=year;
		this.movie_studio=movie_studio;
		this.director=director;
        this.id = ++number;

	}

    // set- та get-методи
	 public String get_name(){//повертає назву фільму
		 return name;
	 }
	 public int get_year(){//повертає рік випуску фільму
		 return year;
	 }
	 public String get_movie_studio(){//повертає назву кіностудії
		 return movie_studio;
	 }
	 public String get_director(){//повертає прізвище і ім'я режисера
		 return director;
	 }
    
	 
	 
    public int getId() {
        return id;
    }
    public TypeMovie GetTypeFilm(){
    	return typef;
    };
    public void setTypeMovie(TypeMovie tf){ 
    	typef = tf; 
    }
   
    
    
    public void set_name(String name){
		 this.name=name;
	 }
    
	 public void set_year(int year){
		 
		 if(year>1895 & year<2022) {//присвоює рік випуску фільму
			 this.year=year;

		 }else {//перевіряє чи рік випуску є коректним
			 System.out.println("Рік випуску фільму: '"+this.name+"' задано невірно!" );
		 }
	 }
	 public void set_movie_studio(String movie_studio){//присвоює назву кіностудії
		 this.movie_studio=movie_studio;
	 }
	 public void set_director(String director){//присвоює прізвище і ім’я режисера
		 this.director=director;
	 }
	 
	 
	 
    // реалізація абстрактного методу абстрактного класу AbstractFilm
    public String ShowMovie() {
   	 result=print_name+": '"+get_name()+"',\t"+print_year+": "+get_year()+",\t"+print_studio+": '"+get_movie_studio()+"', "+print_director+": "+get_director();
   	 return result;  
   
    }

    // реалізація методів інтерфейсу IMovie
    public void Rename(String word) {
        System.out.println("Змінена назва фільму " + getId() + " з назвою " + get_name() + " на " + word);
        set_name(word);
    }
    public void ClearMovie() {
        System.out.println("Очищення даних про об'єкт методом ClearFilm()");
        set_name(null);
        set_year(0);
        set_movie_studio(null);
        set_director(null);
    }

    // перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        return (((this.name == movie.name) || (this.name != null && this.name.equals(movie.get_name()))) && (this.year == movie.year) 
        		&&  ((this.movie_studio == movie.movie_studio) || (this.movie_studio != null && this.movie_studio.equals(movie.get_movie_studio())))
        		&& ((this.director == movie.director) || (this.director != null && this.director.equals(movie.get_director()))));
    };

    // перевизначення методу toString()
    
    public String toString() {
	 result=print_name+": '"+this.name+"',\t"+print_year+": "+this.year+",\t"+print_studio+": '"+this.movie_studio+"', "+print_director+": "+this.director;
	 return result;

    }

    // статичний метод для отримання номеру створеного об'єкту класу
    static int get_number()
    {
        return number;
    }

    // перевизначення методу clone()
    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Копіювання перевизначеним методом clone()");
        Movie newMovie = (Movie) super.clone();
        return newMovie;
    }

    // перевизначення методу compareTo
    public int compareTo(Movie o) {
//порівнюються об'єкти за роком фільму
        int result;
        if(this.year > o.year) {
            result = 1;
        }
        else if(this.year < o.year) {
            result = -1;
        }
        else {
            result = 0;
        }
        return result;
    }
}
