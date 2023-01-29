package Lab4;

public class Movie extends MovieAbstract implements IMovie, Cloneable, Comparable <Movie>  {
	// ������������� ������ �����
    
    private String name;
	private int year;
	private String movie_studio;
	private String director;

	String print_name="����� ������";
	String print_year="�� �������";
	String print_studio="��������";
	String print_director="�������";
	String result="";
    
    private TypeMovie typef;

    
    // ��������� ����� ��� ���������� ����������� ������ ���������� �����
    private int id;

    public Movie() {
        this.id = ++number;
    }   
    
	public Movie(String name, int year, String movie_studio, String director){//����������� ����� � �����������
		this.name=name;
		this.year=year;
		this.movie_studio=movie_studio;
		this.director=director;
        this.id = ++number;

	}

    // set- �� get-������
	 public String get_name(){//������� ����� ������
		 return name;
	 }
	 public int get_year(){//������� �� ������� ������
		 return year;
	 }
	 public String get_movie_studio(){//������� ����� ������䳿
		 return movie_studio;
	 }
	 public String get_director(){//������� ������� � ��'� ��������
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
		 
		 if(year>1895 & year<2022) {//�������� �� ������� ������
			 this.year=year;

		 }else {//�������� �� �� ������� � ���������
			 System.out.println("г� ������� ������: '"+this.name+"' ������ ������!" );
		 }
	 }
	 public void set_movie_studio(String movie_studio){//�������� ����� ������䳿
		 this.movie_studio=movie_studio;
	 }
	 public void set_director(String director){//�������� ������� � ��� ��������
		 this.director=director;
	 }
	 
	 
	 
    // ��������� ������������ ������ ������������ ����� AbstractFilm
    public String ShowMovie() {
   	 result=print_name+": '"+get_name()+"',\t"+print_year+": "+get_year()+",\t"+print_studio+": '"+get_movie_studio()+"', "+print_director+": "+get_director();
   	 return result;  
   
    }

    // ��������� ������ ���������� IMovie
    public void Rename(String word) {
        System.out.println("������ ����� ������ " + getId() + " � ������ " + get_name() + " �� " + word);
        set_name(word);
    }
    public void ClearMovie() {
        System.out.println("�������� ����� ��� ��'��� ������� ClearFilm()");
        set_name(null);
        set_year(0);
        set_movie_studio(null);
        set_director(null);
    }

    // �������������� ������ equals
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

    // �������������� ������ toString()
    
    public String toString() {
	 result=print_name+": '"+this.name+"',\t"+print_year+": "+this.year+",\t"+print_studio+": '"+this.movie_studio+"', "+print_director+": "+this.director;
	 return result;

    }

    // ��������� ����� ��� ��������� ������ ���������� ��'���� �����
    static int get_number()
    {
        return number;
    }

    // �������������� ������ clone()
    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("��������� �������������� ������� clone()");
        Movie newMovie = (Movie) super.clone();
        return newMovie;
    }

    // �������������� ������ compareTo
    public int compareTo(Movie o) {
//����������� ��'���� �� ����� ������
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
