package Lab4;

abstract class MovieAbstract{
	static int number;
    //����������� ����������� �����
	MovieAbstract()
    {

    }
    //����� ������������ �����
    int GetCount(){
    	return number;
    };
    //����������� ����� ������������ �����
    abstract String ShowMovie();
}
