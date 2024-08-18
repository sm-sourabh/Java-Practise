import java.util.ArrayList;
import java.util.Scanner;

// class Inventory{
//     private int invId;
//     private String maxQuantity;
//     private int currQuantity;
//     private int threshold;

//     Inventory(int invId,String maxQuantity,int currQuantity,int threshold){
//         this.invId=invId;
//         this.maxQuantity=maxQuantity;
//         this.currQuantity=currQuantity;
//         this.threshold=threshold;
//     }

//     public int getInvId(){
//         return invId;
//     }
//     public String getmaxQString(){
//         return maxQuantity;
//     }
//     public int getcurrQuantity(){
//         return currQuantity;
//     }
//     public int getThreshold(){
//         return threshold;
//     }

//     public void display(){
//         System.out.println("The inventory id is :" + invId);
//         System.out.println("The maxQuantity is :" + maxQuantity);
//         System.out.println("The currQuantity is :" + currQuantity);
//         System.out.println("The threshold is :" + threshold);
//     }
// }

// public class SolutionInventory {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Inventory[] arr=new Inventory[4];

//         for(int i=0;i<arr.length;i++){
//             int id=sc.nextInt();
//             sc.nextLine();
//             String quantity=sc.nextLine();
//             int currQuantity=sc.nextInt();
//             int threshold=sc.nextInt();

//             arr[i]= new Inventory(id,quantity,currQuantity,threshold);
//         }
//         int limit=sc.nextInt();

//            // USING THE ARRAY LIST METHOD DIRECTLY ---
//         ArrayList<Inventory> output=replenish(arr,limit);
//         /* 
//         for(int i=0;i<output.size();i++){
//             if(output.get(i).getThreshold()>75){
//                 System.out.println(output.get(i).getInvId() + "Critical filling");
//             }else if(output.get(i).getThreshold()<75 && output.get(i).getThreshold()>50){
//                 System.out.println(output.get(i).getInvId() + "Moderate filling");
//             }else{
//                 System.out.println(output.get(i).getInvId() + "Non Critical Filling");
//             }
//         }
//         */

//         Inventory[] lastArray=new Inventory[output.size()];
//         output.toArray(lastArray);
//         for(int i=0;i<lastArray.length;i++){
//             if(lastArray[i].getThreshold()>75){
//                 System.out.println(lastArray[i].getInvId() + " Critical filling");
//             }else if(lastArray[i].getThreshold()<75 && lastArray[i].getThreshold()>50){
//                 System.out.println(lastArray[i].getInvId() + " Moderate filling");
//             }else{
//                 System.out.println(lastArray[i].getInvId() + " Non Critical Filling");
//             }
//         }

//         sc.close();
//     }
//     public static ArrayList<Inventory> replenish(Inventory[] arr,int limit){
//         ArrayList<Inventory> res= new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             int v=arr[i].getThreshold();
//             if(v<=limit){
//                 res.add(arr[i]);
//             }
//         }
//         return res;
//     }
// }



class Inventory{
    private String id;
    private int maxQuan;
    private int currQuan;
    private int thereshold;

    Inventory(String id,int maxQuan, int currQuan, int thereshold){
        this.id=id;
        this.maxQuan=maxQuan;
        this.currQuan=currQuan;
        this.thereshold=thereshold;
    }
    public int getThres(){
        return thereshold;
    }
    public String getID(){
        return id;
    }

}
public class SolutionInventory{
    public static void main(String args[]){
        Inventory[] inv = new Inventory[4];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<inv.length;i++){
            String id=sc.nextLine();
            int maxQuan=sc.nextInt();
            int currQuan=sc.nextInt();
            int thereshold=sc.nextInt();
            sc.nextLine();
            inv[i]=new Inventory(id, maxQuan, currQuan, thereshold);
        }
        int limit= sc.nextInt();
        sc.close();

        ArrayList<Inventory> res = replenish(inv, limit);

        System.out.println(res);
        
        for(Inventory i: res){
            if(i.getThres()>75){
                System.out.println(i.getID() + " Critical Filling");
            } else if(i.getThres()<=75 && i.getThres()>50){
                System.out.println(i.getID() + " Moderate Filling");
            } else{
                System.out.println(i.getID() + " Non-Critical Filling");
            }
        };
    }
    public static ArrayList<Inventory> replenish(Inventory[] inv, int limit){
        ArrayList<Inventory> ls=new ArrayList<>();
        for(int i=0;i<inv.length;i++){
            if(inv[i].getThres()<=limit){
                ls.add(inv[i]);
            }
        }
        return ls;

    }
}