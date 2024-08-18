import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class practise1_1 {
    
                // COUNT LOWER CASE 
    /*public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;

        for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c>='a' && c<='z'){
                    count++;
                }
        }
        if(count==0){
            System.out.println("Now lower case characters present");
        }else{
            System.out.println(count);
        }
    }
    */

    /*          FIND LAST CHARCTAER 
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine().trim();  // to remove leading or training spaces

        String[] arr=str.split("\\s+"); //split by one or more white space characters 

        for(int i=0;i<arr.length;i++){
            char c=arr[i].charAt(arr[i].length()-1);
            if(Character.isLetter(c)){
                System.out.print(c);
            }
        }
        sc.close();
    }
    */
    /*          REVERSE A NUMBER
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num>0){
            int last=num%10;
            reverse=reverse*10+last;
            num=num/10;
        }
        System.out.println(reverse);
        sc.close();
    }*/
    /*public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        String s=Integer.toString(num);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        int reverse=Integer.parseInt(sb.toString());
        System.out.println(reverse);
        sc.close();
    }*/

    /*  REVERSE A STRING but it's immutable;
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length()/2;i++){
            char f=str.charAt(i);
            char l=str.charAt(str.length()-1-i);

            char temp=f;
            f=l;
            l=temp;
        }
    System.out.println(str);
        sc.close();
    }
    */
    /*      REVERSE STRING USING CHAR ARRAY()
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();

        char[] arr=str.toCharArray();

        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        String reversed=new String(arr);
    System.out.println(reversed);
        sc.close();
    }
    */

    //      reverse using string builder class
    // public static void main(String args[]){
    //     Scanner sc=new Scanner (System.in);
    //     String str=sc.nextLine();
    //     StringBuilder sb= new StringBuilder(str);

    //     sb.reverse();
    //     String reverse=new String(sb.toString());
    //     System.out.println(reverse);
        
    //     sc.close();
    // }
        /*      Smallest Vowel 
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        ArrayList<Character> arr=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                arr.add(str.charAt(i));
            }
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        sc.close();
    }
    */
                //  STRING ARRAY CONTAIN METHOD
    /*public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        // Character []arr={'a','e','i','o','u'};  cahracter array doesn't have CONTAIN fun
        String []arr={"a","e","i","o","u"};  
        for(int i=0;i<arr.length;i++){
            if(str.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
        }
        sc.close();
    }*/

    /*public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int cCount=0;
        int sCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                continue;
            }else if(str.charAt(i)==(' ')){
                sCount++;
            }else{
                cCount++;
            }
        }
        System.out.println("The no of spaces are : " + sCount);
        System.out.println("The no of characters are : " + cCount);
        sc.close();
    }*/

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        int unique=set.size();
        System.out.println("No of unique charcter are : "+ unique);
        Iterator<Character> it=set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (Character ch : set) {
            System.out.print(ch + " ");
        }
        sc.close();
    }


}
