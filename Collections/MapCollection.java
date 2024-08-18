import java.util.*;

public class MapCollection{
    public static void main(String args[]){
        Map<Integer, String> m=new HashMap<>();
        m.put(1,"Sourabh");
        m.put(2,"Rahul");
        m.put(3,"Darhsna");
        m.put(4,"Sumanshu");

        //m.put(2,"Shaitan"); //invalid as it alreadt exists

        if(!m.containsKey(2)){
            m.put(2,"Shaitan");
        }
        System.out.println(m);

        for( Map.Entry<Integer,String> it : m.entrySet()){
            System.out.print(it.getKey());
            
            System.out.print(it.getValue());
            System.out.println(" ");
        }

        for( Map.Entry<Integer,String> it : m.entrySet()){
            System.out.println(it);
        }


    }
}