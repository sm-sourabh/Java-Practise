public class SuperKeyword{
    public static void main(String args[]){} 
        Emp e1=new Emp(1,"ankit",45000f);  
        e1.display();  
        }
    }

}
class Person{   //parent class
    int id;  
    float salary=1000;
    String name;  
    Person(int id,String name){  
        this.id=id;  
        this.name=name;  
    }  
}  

class Emp extends Person{   //child class
    float salary=2000;  
    Emp(int id,String name,float salary){  
        super(id,name); //reusing parent constructor  
        this.salary=salary;  
    }  
    
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }  
}  
    