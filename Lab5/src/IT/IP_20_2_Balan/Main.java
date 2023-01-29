package IT.IP_20_2_Balan;
	
public class Main {

	public static void main(String[] args) {
        Operation<Integer> operation = new Operation<>();
		
        Set<Integer> set1 = new Set(6);
        Set<Integer> set2 = new Set<>(6);

        Integer[] plural1 = {2, 7, 8, 5, 1, 9};
        Integer[] plural2 = {1, 2, 4, 5, 9, 6};
        set1.setSet(plural1);
        set2.setSet(plural2);
      
       
        System.out.println("Об'єднання множин plural1 i plural2 :");
        Object[] finally_mas = operation.unionSets(set1,set2);
       
        for(int i=0; i<finally_mas.length; i++){
            System.out.print(finally_mas[i]+" ");
        }

        System.out.println("\nПеретин множин plural1 i plural2 :");

        finally_mas = operation.intersectionSets(set1, set2);
        for(int i=0; i<finally_mas.length; i++){
            System.out.print(finally_mas[i]+" ");
        }

        System.out.println("\nРізниця множин plural1 i plural2 :");
        finally_mas = operation.diferenceSets(set1, set2);
        for(int i=0; i<finally_mas.length; i++){
            System.out.print(finally_mas[i]+" ");
        }

        System.out.println("\nСиметрична різниця множин plural1 i plural2 :");
        finally_mas = operation.symmetricDiffSets(set1, set2);
        for(int i=0; i<finally_mas.length; i++) {
            System.out.print(finally_mas[i]+" ");
        }
        
        System.out.println("\nЧи є множини plural1 i plural2 рівні між собою : "+operation.equalitySets(set1, set2)+" ");
        System.out.println("\nЧи включає множина plural1 множину plural2  : "+operation.equalitySets(set1, set2)+" ");
        System.out.println("\nЧи включає множина plural2 множину plural1  : "+operation.equalitySets(set2, set1)+" ");

	}
}
