package IT.IP_20_2_Balan;

import java.util.Arrays;

public class Operation<T> {
    public T[] unionSets(Set<T> s1, Set<T> s2){    //Об'єднання множин    
       T[] mas1 = s1.getSet();
       T[] mas2 = s2.getSet();
       
       int sum_lenght=mas1.length+mas2.length;
       T[] mas_new = (T[]) new Object[sum_lenght];
        for(int i=0; i<sum_lenght; i++){
            if(i<mas1.length){
            	mas_new[i] = mas1[i];
            }
            else {
            	mas_new[i] = mas2[i-mas2.length];
            }
        }
        Arrays.sort(mas_new);
        for(int i=0; i<mas_new.length-1; i++) {
            if (mas_new[i]==mas_new[i+1]){
            	mas_new[i]=null;
            }
        }
        T[] mas3= Delete(mas_new);
        
        return mas3;
    }

    public T[] intersectionSets(Set<T> s1, Set<T> s2){ //Перетин множин
        T[] mas1 = s1.getSet();
        T[] mas2 = s2.getSet();
        int sum_lenght=mas1.length+mas2.length;
        T[] mas_new = (T[]) new Object[sum_lenght];
        
        int k=0;
        for(int i=0; i<mas1.length; i++){
            for(int j=0; j<mas2.length; j++){
                if(mas1[i]==mas2[j] && mas_new[k]!=mas1[i]) {
                	k++;
                	mas_new[k] = mas1[i];
                }
            }
        }
        T[] mas3= Delete(mas_new);
        Arrays.sort(mas3);
        return mas3;
    }

    public T[] diferenceSets(Set<T> s1, Set<T> s2){  //Різниця множин 
        T[] mas1 = (T[]) s1.getSet();
        T[] mas2 = (T[]) s2.getSet();
        T[] mas_new = mas1.clone();
        
        for(int i=0; i<mas1.length-1; i++){
            for(int j=0; j<mas2.length-1; j++) {
                if (mas1[i] == mas2[j]){                  
                	mas_new[i] = null;
                }
            }
        }
        T[] mas3= Delete(mas_new);
        Arrays.sort(mas3);
        return mas3;
    }

    public T[] symmetricDiffSets(Set<T> s1, Set<T> s2){ //Симетрична різниця     
        T[] mas3;
        T[] mas4;
        int k=0;
        
        mas3 = this.unionSets(s1, s2);                     
        mas4 = this.intersectionSets(s1, s2); 
        
        Set<T> s3 = new Set<>(mas3.length);
        s3.setSet(mas3);
        Set<T> s4 = new Set<>(mas3.length);
        s4.setSet(mas4);
        mas3 = this.diferenceSets(s3, s4);
        
        Arrays.sort(mas3);
        return mas3;
    }

    public boolean equalitySets(Set<T> s1, Set<T> s2) {//Рівність множин
         T[] mas_new=intersectionSets(s1, s2);
         boolean znach;
         
         if(mas_new.length==s1.getSet().length & mas_new.length==s2.getSet().length) {
        	 znach=true;
         }else {
        	 znach=false;
         }
		return znach;
    }
    
    public boolean inclusionSets(Set<T> s1, Set<T> s2) {//Включення множин
        boolean znach;
        
        if(s1.getSet().length>s2.getSet().length ) {
        	T[] mas_new=intersectionSets(s1, s2);
        	if(mas_new.length>s1.getSet().length) {
        		znach=true;
        		}
        	else {
           	 znach=false;
            }
       	 
        }else {
       	 znach=false;
        }
		return znach;

   }

     T[] Delete(T[] mas){
        int k=0;
        for(int i=0; i< mas.length; i++){ 
            if(mas[i] == null){
                k++;
            }
        }
       
        T[] mas3= (T[]) new Object[mas.length-k];
        int n=0;
        for(int i=0; i< mas.length; i++){
            if(mas[i]!= null){ 
            	mas3[n]=mas[i];
                n++;
            }
        }
        return mas3;
    }
}
