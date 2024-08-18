import java.util.*;

public class collections1 {
    public static void main(String args[]){


        // Array List maintains: --
        //1. contains duplicates
        //2. maintains order 

        // -There are various ways to traverse the collection elements:
        // -By Iterator interface.
        // -By for-each loop. 
        // -By ListIterator interface.
        // -By for loop.
        // -By forEach() method.

        // Collections : 

        //Collection<Integer> arr= new ArrayList();
        //ArrayList<Integer> arr=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(40);
        arr.add(30);
        arr.add(100);
        arr.add(40);
        System.out.println(arr);


        //size of list 
        int n=arr.size();

        // Iterator Interface 
        System.out.println("Traversing list through Iterator Interface:"); 
        
        Iterator<Integer> itr=arr.iterator(); 
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //Loops 
        System.out.println("Traversing list through for loop:");  
    
        for(int i=0;i<arr.size();i++){  
            System.out.print(arr.get(i) + " ");     
        }   
        System.out.println();
        // get() method only valid for ArrayList Class and not for Collection Interface.


        // For Each - LOOP :
        System.out.println("Traversing list through for EACH - loop:");
        for(Integer i : arr){  
            System.out.print(i + " ");     
        } 
        System.out.println();


        // SORTING THE ARRAYLIST :
        Collections.sort(arr);
        System.out.println("The sorted list is : " + arr);

        //arr2.addAll(arr);

        //System.out.println(arr2);
    }

}
