import java.util.*;

class Naval{
    private int Id; 
    private String vName;  
    private int vPlanned; 
    private int vCompleted;
    private String purpose;
    private String classification;

    Naval( int Id, String vName, int vPlanned, int vCompleted, String purpose){
        this.Id=Id;
        this.vName=vName;
        this.vPlanned=vPlanned;
        this.vCompleted=vCompleted;
        this.purpose=purpose;
        // this.classification=classification;
    }

    // public int getInvId(){
    //     return invId;
    // }
    // public String getmaxQString(){
    //     return maxQuantity;
    // }
    public int getvCompleted(){
        return vCompleted;
    }
    public int getvPlanned(){
        return vPlanned;
    }
}

public class SolutionNaval {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Naval[] arr=new Naval[4];

        for(int i=0;i<arr.length;i++){
            int Id=sc.nextInt();
            sc.nextLine();
            String vName=sc.nextLine();
            int vPlanned=sc.nextInt();
            int vCompleted=sc.nextInt();
            sc.nextLine();
            String purpose=sc.nextLine();
            //String classification=sc.nextLine();

            arr[i]= new Naval(Id,vName,vPlanned,vCompleted,purpose);
        }
        int percent=sc.nextInt();
        sc.nextLine();
        String searchPurposeValue = sc.nextLine();
        ArrayList<Naval> cleared=findAvg(arr, percent);
        int sum=0;
        for(int i=0;i<cleared.size();i++){
            sum +=cleared.get(i).getvCompleted();
            }
        System.out.println("The avg of completed voyages is : " + (int)(sum/cleared.size()));
        }
    public static ArrayList<Naval> findAvg(Naval[] arr,int percent){
        ArrayList<Naval> verified=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if((arr[i].getvCompleted()*100 )/arr[i].getvPlanned() > percent){
                verified.add(arr[i]);
            }
        }
        return verified;
    }   
}
