import java.util.*;

class perfectSquare {
    public static void main(String args[]){
        
        /*Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int num=(int)Math.sqrt(arr[i]);
            if((num*num)==(arr[i])){
                System.out.println(arr[i]);
             }
        }
        sc.close();
        */

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                System.out.print(str.charAt(i));
            }
        }
    }
}





    /*public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //int[] arr=new int[t];
        int[] arr={9,24,7,33,99,100};
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int it:arr){
            System.out.print(it + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Ascending order :");
        for(int it:arr){
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.println("printing without for loop :" + Arrays.toString(arr));
        System.out.println();

        System.out.println("Descending order :");
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int it:arr){
            System.out.println(it);
        }
        System.out.println("printing without for loop :" + Arrays.toString(arr));
        */

