import java.util.*;

class Associate{
    private int id;
    private String name;
    private String tech;
    private int exp;

    Associate(int id,String name,String tech, int exp){
        this.id=id;
        this.name=name;
        this.tech=tech;
        this.exp=exp;
    }

    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getExp(){
        return exp;
    }
    public String getTech(){
        return tech;
    }
    
}

public class AssociateSolution {
    public static void main(String args[]){
        Associate[] arr=new Associate[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String tech=sc.nextLine();
            int exp=sc.nextInt();
            sc.nextLine();
            arr[i]=new Associate(id,name,tech,exp);
        }
        String str=sc.nextLine();
        sc.close();

        List<Associate> res= new ArrayList<>();
        res=assGivenTech(arr, str);

        for(Associate i : res){
            System.out.println(i.getid());
        }
    }
    public static ArrayList<Associate> assGivenTech(Associate[] arr,String str){
        ArrayList<Associate> ls=new ArrayList<>();
        for(int i=0;i<5;i++){
            if((arr[i].getTech()).equals(str) && (arr[i].getExp())%5==0){
                ls.add(arr[i]);
            }
        }
        return ls;
    }
    
}
