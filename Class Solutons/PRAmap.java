import java.util.*;

class Chair{
    private int id;
    private double height;
    private double base;
    private String material;

    Chair(int id,double height,double base,String material){
        this.id=id;
        this.height=height;
        this.base=base;
        this.material=material;
    }

    public int getID(){
        return id;
    }
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }
    public String getMaterial(){
        return material;
    }

    public double getVolume(){
        return height*base;
    }

}

public class PRAmap {
    public static void main(String args[]){
        Map<Integer,Chair> map= new HashMap<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int id=sc.nextInt();
            double height=sc.nextDouble();
            double base=sc.nextDouble();
            sc.nextLine();
            String material=sc.nextLine();
            map.put(id,new Chair(id, height, base, material));
        }
            sc.close();
            int resKey=getMaxKey(map);
            System.out.println(map.get(resKey).getMaterial());

    }
    public static Integer getMaxKey(Map<Integer,Chair> map){
        int maxKey=Integer.MIN_VALUE;
        
        /*
        for(Map.Entry<Integer,String> m: map.entrySet()){
            if(m.getKey()>maxKey){
                maxKey=m.getKey();
            }
        } */
        for(int i:map.keySet()){
            if(i>maxKey){
                maxKey=i;
            }
        }
        return maxKey;
    }
    
}
