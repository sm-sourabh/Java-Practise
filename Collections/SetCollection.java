import java.util.*;

public class SetCollection {
    public static void main(String args[]){
        Set<Integer> s=new HashSet<>();

        //Does not maintain Order , LinkedHashSet Maintains order.
        // No duplicates Allowed
        //1. ADD method

        s.add(7);
        s.add(8);
        s.add(50);
        s.add(70);
        s.add(5);
        s.add(50);
        System.out.println(s);

        Iterator<Integer> itr = s.iterator();
        System.out.println("through Iterator: ");
        while(itr.hasNext()){
            System.out.print(itr + " ");
        }
        System.out.println();

        //2. Contains 
        // if(s.contains(50)){
        //     System.out.println("Contains the Element 50 ");
        // }
        s.remove(2);
        s.size();
        Collections.sort(s);
        
        System.out.println(s);


            
        };
    }

