import java.util.*;
public class DataTransmission {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        str = str.replace(";" , "");
        String[] arr=str.split(" ");

        ArrayList<Integer> res=new ArrayList<>(); 
        System.out.println("The initial array is : " + Arrays.toString(arr));
        System.out.println();

        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i]);
            if(isPrimeNum(num)){
                res.add(num);
            }
        }
        int sum=0;
        for(int it:res){
            sum+=it;
        }
        Collections.sort(res);
        System.out.println("The prime number array is :");
        for(int i : res){
            System.out.print( i + " ");
        }

        System.out.println();

        System.out.println("The Num of primes are: "+ res.size() + 
        " & the overall sum is: "+ sum );
        Collections.sort(res);
        System.out.println("The Second largest Prime is:" + res.get(res.size()-2));
        int result_output=res.get(res.size()-2) + res.size();
        System.out.println("The result will be :" + result_output);

    }
    public static boolean isPrimeNum(int num){
        int x=(int)Math.sqrt(num);
        if(num<=1) return false;

        for(int i=2;i<=x;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
