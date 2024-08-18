import java.util.*;

class HeadSet{
    private String headsetname;
    private String brand;
    private int price;
    private boolean available;

    // Constrcuctor doesn't have a type . Also it does the job os a setter function.
    HeadSet(String headsetname, String brand, int price, boolean available){   
        this.headsetname=headsetname;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }

    //void getter(){}
    public String getheadsetname(){
        return headsetname;
    }
    public String getbrand(){
        return brand;
    }
    public int getprice(){
        return price;
    }
    public boolean getavailable(){
        return available;
    }

    public void display(){
        System.out.println("headset name is:" +headsetname);
        System.out.println("brand name is :" +brand);
        System.out.println("price is:"+price); 
        System.out.println(available);
        System.out.println();
    }  
};

public class Solution{
    public static void main(String args[]){
        HeadSet[] arr=new HeadSet[4];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            String headsetname=sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();
            boolean available=sc.nextBoolean();
            sc.nextLine();
            arr[i]=new HeadSet(headsetname,brand,price,available);
        }
        //sc.close();

        //public static integer totalprice(Headsets[] arr){}
        for(int i=0;i<4;i++){
            arr[0].display();
        }
        String str1=sc.nextLine();
        displaytotalprice(arr,str1);
        secondMin(arr);

        sc.close();
    }

    public static void displaytotalprice(HeadSet[] arr,String brand){
        //Scanner scan=new Scanner(System.in);
        boolean flag=false;
        int price=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getbrand().equals(brand)){
                flag=true;
                price+=arr[i].getprice();
            }
        }
        if(flag==true){
            System.out.println("The price of product is: "+ price);
        }else{
            System.out.println("No such product");
        }
    }

    public static void secondMin(HeadSet[] arr){
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        String secondLowestName = null;

    for (int i = 0; i < arr.length; i++) {
        int price = arr[i].getprice();

            if (price < lowest && arr[i].getavailable()) {
                secondLowest = lowest;
                lowest = price;
            } else if (price < secondLowest && price != lowest && arr[i].getavailable()) {
                secondLowest = price;
                secondLowestName = arr[i].getheadsetname();
            }
        }
        if (secondLowest == Integer.MAX_VALUE) {
            System.out.println("All headsets have the same price.");
        } else {
            System.out.println("Second minimum price is: " + secondLowest);
            System.out.println("Headset name is: " + secondLowestName);
        }
    }
}
