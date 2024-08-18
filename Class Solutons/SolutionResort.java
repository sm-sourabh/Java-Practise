import java.util.Random;
import java.util.Scanner;

class Resort{
    private int id;
    private String rName;
    private String category;
    private double price;
    private double rating;

    Resort(int id, String rName,String category,double price,double rating){
        this.id=id;
        this.rName=rName;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }

    public int getid(){
        return id;
    }
    public String getName(){
        return rName;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public double getRating(){
        return rating;
    }

    public void display(){
        System.out.println("id :" +id);
        System.out.println("Name :" +rName);
        System.out.println("Category "+category);
        System.out.println("price :" + price);
        System.out.println("rating :"+ rating);
    }
};

public class SolutionResort{
    public static void main(String args[]){
        Resort[] arr= new Resort[4];
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String rName=sc.nextLine();
            String category=sc.nextLine();
            double price=sc.nextDouble();
            double rating=sc.nextDouble();
            sc.nextLine();

            arr[i]=new Resort(id, rName, category, price, rating);
        }
        for(Resort it:arr){
            it.display();
        }
        String str = sc.nextLine();
        
        avg(arr,str);
        sc.close();
    }
    public static void avg(Resort[] arr, String str){
        int val=0;
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCategory().equals(str) && arr[i].getRating()>4){
                val+=(int)arr[i].getPrice();
                x++;
            }
        }
        int res=val/x;
        System.out.println("The avg rating of the" + str +  "resorts are :" + res);
    }
}
