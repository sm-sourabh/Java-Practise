import java.util.*;

public class arrayList {
    public static void main(String args[]){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Hello");
        System.out.println(arr);

        ArrayList<Integer> arrInt=new ArrayList<>();
        arr.add(40);
        arr.add(40);
        arr.add(40);
        System.out.println(arr);

        List<Integer> ls=new ArrayList<>();
        ls.add(30);
        ls.add(40);
        ls.add(50);
        //ls.addAll(arr);
        System.out.println(ls);

        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("ch");
        arr2.add("c");
        arr2.add("c");
        System.out.println(arr2);

        arr2.addAll(arr);
        System.out.println(arr2);

    }

}
