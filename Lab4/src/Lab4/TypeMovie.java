package Lab4;

public enum TypeMovie {
	HORRORS("�����"),
    COMEDY("������"),
    ACTION("�������"),
    DETECTIVE("��������");
    private String type;
    //����������� enum-����� TypeFilm
    TypeMovie(String type) {
        this.type = type;
	}
    //����� ��� ��������� ����� ������ enum-����� TypeFilm
    public String GetType(){return type;}

}
