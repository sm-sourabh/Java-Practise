import java.util.*;

public class arrayList {
    public static void main(String args[]){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Hello");
        System.out.println(arr);

        ArrayList<String> arr2=new  ArrayList<>();
        System.out.println(arr2);
        arr2.addAll(arr);
        System.out.println(arr2);

        // ArrayList<Integer> arrInt=new ArrayList<>();
        // arr.add(40);
        // arr.add(40);
        // arr.add(40);
        // System.out.println(arr);

        List<Integer> ls=new ArrayList<>();
        ls.add(30);
        ls.add(40);
        ls.add(50);
        //ls.addAll(arr);
        System.out.println("Before Sorting : " + ls);
        Collections.sort(ls);
        System.out.println("After Sorting: " + ls);

        Array[] newArr=Collections.toArray(arr)

    }

}
