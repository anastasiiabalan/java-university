package Lab7;

interface IMovie{
	public String toString();
}
public class Movie implements IMovie{
	//ïåğåğàõóâàííÿ çì³ííèõ êëàñó
			private String name;
			private int year;
			private String movie_studio;
			private String director;
			
			String print_name="Íàçâà ô³ëüìó";
			String print_year="ğ³ê âèïóñêó";
			String print_studio="ê³íîñòóä³ÿ";
			String print_director="ğåæèñåğ";
			String result="";
			
			static int count_movie=0;
			
			public Movie(){ //êîíñòğóêòîğ êëàñó ïî çàìîâ÷óâàííş
				this.name="Movie";
				this.year=0000;
				this.movie_studio="Movie studio";
				this.director="Director";
				count_movie++;

			}
			
			public Movie(String name, int year, String movie_studio, String director){//êîíñòğóêòîğ êëàñó
				this.name=name;
				this.year=year;
				this.movie_studio=movie_studio;
				this.director=director;
				count_movie++;
			}
			//ìåòîäè êëàñó
			 public void set_name(String name){
				 this.name=name;
			 }
			 public void set_year(int year){
				 
				 if(year>1895 & year<2022) {//ïğèñâîşº ğ³ê âèïóñêó ô³ëüìó
					 this.year=year;

				 }else {//ïåğåâ³ğÿº ÷è ğ³ê âèïóñêó º êîğåêòíèì
					 System.out.println("Ğ³ê âèïóñêó ô³ëüìó: '"+this.name+"' çàäàíî íåâ³ğíî!" );
				 }
			 }
			 public void set_movie_studio(String movie_studio){//ïğèñâîşº íàçâó ê³íîñòóä³¿
				 this.movie_studio=movie_studio;
			 }
			 public void set_director(String director){//ïğèñâîşº ïğ³çâèùå ³ ³ì’ÿ ğåæèñåğà
				 this.director=director;
			 }
			 
			 
			 public String get_name(){//ïîâåğòàº íàçâó ô³ëüìó
				 return name;
			 }
			 public int get_year(){//ïîâåğòàº ğ³ê âèïóñêó ô³ëüìó
				 return year;
			 }
			 public String get_movie_studio(){//ïîâåğòàº íàçâó ê³íîñòóä³¿
				 return movie_studio;
			 }
			 public String get_director(){//ïîâåğòàº ïğ³çâèùå ³ ³ì'ÿ ğåæèñåğà
				 return director;
			 }

			
			 
			 public int get_count() {//ïîâåğòàº ïîğÿäêîâèé íîìåğ ô³ëüìó
				 return count_movie;
			 }
			 
		
			 @Override
			 public String toString(){	 //âèâîäèòü íà åêğàí ³íôîğìàö³ş ïğî ô³ëüì
				 result=print_name+": '"+this.name+"',\t"+print_year+": "+this.year+",\t "+print_studio+": '"+this.movie_studio+"', "+print_director+": "+this.director;
				 return result;
			 }
}
