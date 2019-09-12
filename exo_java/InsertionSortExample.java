

public class InsertionSortExample {  
    public static void insertionSort(int tab[]) {   
        for (int i = 1; i < tab.length; i++) 
        {  
            int A = tab[i];
            int j = i-1;
            while( (j >= 0) && (tab[j] > A) )
            {
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = A;
        }  
    }  
       
    public static void main(String a[]){    
        int tab[] = {1, 7, 6, 2, 15, 12, 4, 7, 0};    
        System.out.println("Avant le tri");

        for(int i = 0; i < tab.length; i++)
        {    
            System.out.print(tab[i] + " ");    
        }    
        System.out.println();    
            
        insertionSort(tab);//Trie le tableau   
           
        System.out.println("Après le tri"); 

        for(int i:tab)
        {    
            System.out.print(i + " ");    
        }    

    }    
}    