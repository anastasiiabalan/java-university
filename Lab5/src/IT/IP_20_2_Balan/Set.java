package IT.IP_20_2_Balan;

public class Set<T> {
	private T[] mas_list;
	
	public void setSet(T[] mas){//����� �������� �� ���� ������� � ������ ������������ ������ 
		for(int i=0; i<mas.length; i++){
			mas_list[i] = mas[i];
	     }
	}
	
	public T[] getSet(){// ����� ��������� ������������ �����
	        return mas_list;
	}
	
    public Set(int n) {
    	mas_list = (T[])new Object[n];//��`�������� ������ � ��������� ����� Set
    }
}
