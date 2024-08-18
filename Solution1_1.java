import java.util.*;

public class Solution1_1{
    public static void main(String args[]){ 
        int count=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] v=str.split(" ");
        for(int i=0;i<v.length;i++){
            char c=v[i].charAt(0);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' 
            || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
            }
        }
        if(count==0){
            System.out.println("No Words");
        }else{
            System.out.println(count);
        }
    }
}
