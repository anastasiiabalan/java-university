package Lab4;

abstract class MovieAbstract{
	static int number;
    //конструктор абстракного класу
	MovieAbstract()
    {

    }
    //метод абстрактного класу
    int GetCount(){
    	return number;
    };
    //абстрактний метод абстрактного класу
    abstract String ShowMovie();
}
