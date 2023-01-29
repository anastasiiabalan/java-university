package Lab7;

public enum TypeMovie {
	HORRORS("Хорор"),
    COMEDY("Комедія"),
    ACTION("Бойовик"),
    DETECTIVE("Детектив");
    private String type;
    //конструктор enum-класу TypeFilm
    TypeMovie(String type) {
        this.type = type;
	}
    //метод для отримання жанру фільму enum-класу TypeFilm
    public String GetType(){return type;}
}
