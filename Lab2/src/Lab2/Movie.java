package Lab2;

public class Movie {
	//������������� ������ �����
		private String name;
		private int year;
		private String movie_studio;
		private String director;
		
		String print_name="����� ������";
		String print_year="�� �������";
		String print_studio="��������";
		String print_director="�������";
		String result="";
		
		static int number=0;
		
		public Movie(){ //����������� ����� �� ������������
			this.name="Movie";
			this.year=0000;
			this.movie_studio="Movie studio";
			this.director="Director";
		}
		
		public Movie(String name, int year, String movie_studio, String director){//����������� �����
			this.name=name;
			this.year=year;
			this.movie_studio=movie_studio;
			this.director=director;
		}
		
		//������ �����
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

		 
		 public void print_Movie(){//�������� �� ����� ���������� ��� �����
			 result=print_name+": '"+this.name+"',\t"+print_year+": "+this.year+",\t "+print_studio+": '"+this.movie_studio+"', "+print_director+": "+this.director;
			 System.out.println(result);

		 }
		 public void print_Movie_Upper(){//�������� �� ����� ���������� ��� ����� � ������ ��������
			 result=print_name+": '"+this.name+"',\t"+print_year+": "+this.year+",\t"+print_studio+": '"+this.movie_studio+"', "+print_director+": "+this.director;
			 System.out.println(result.toUpperCase());

		 }
		 
		 public int get_number() {//������� ���������� ����� ������
			 return ++number;
		 }
}
