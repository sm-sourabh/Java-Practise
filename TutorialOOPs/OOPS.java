//package TutorialOOPs;
import java.util.*;

import javax.sound.midi.Soundbank;


            //1.  INHERTITANCE CONCEPTS
class A{
    void show(){
        System.out.println("Sabhya Mental");
    }    
    static void show2(){
        System.out.println("Sabhya is cutest");
    }
}
            //default void show1(){  
            //    System.out.println("Sabhya is Okayish");
            //}
            // DEFAULT KEYWORD ONLY USED IN INTERFACE METHODS
class B extends A{
    void show(){
        System.out.println("Sabhya Gadhi");
    }
    static void show2(){
        System.out.println("Sabhya is cuty");
    }
    
    int x=6;
    int y=7;
    static int z=999;

                    /// POLYMORPHISM CONCEPT:--
                    /*
                    1. Runtime polymorphism can't be achieved by data members.

                     */
                    
    void add(int x){
        System.out.println(x);
    }
    void add(int x,int y){
        System.out.println(x+y);
    }
}

            //INTERFACE CONCEPT ---
            /*
             * A Java interface is a group of abstract methods that specify the behavior that implementing classes 
             */
interface C{
    void display();
    default void dikhao(){
        System.out.println("Sabhya Gutki");
    }
    static void displays(){
        System.out.println("Sabhya Butki");
    }
}

class D implements C{
    public void display(){
        System.out.println("Sabhya Sanchi");
    }
}

            /// ENCAPSULATION CONCEPT : --
class E{
    int a;
    int b;
    String Name;
    static String Name2;
    void add(int a,int b){
        System.out.println(a+b);
    }
    static void displayss(){
        System.out.println("Static method :" + Name2);
    }
    E(int a,int b,String Name,String name2){
        this.a=a;
        this.b=b;
        this.Name=Name;
        this.Name2=name2;
    }
    void displayE(){
        System.out.println("Sabhya's Rating : " + (a  + b));
    }
}
            
public class OOPS
{
    // static int a=5;
	public static void main(String[] args) {
		B objb=new B();
		objb.show();
		objb.add(9);
		objb.add(10,100);
		
		
		//Inside a static method ,there is no need of using obj to call a static 
		// VARIABLE and a METHOD , can be directly called using class name.
		// It can be called using both class and obj refernce.
		B.show2();
		A.show2();
		objb.show2();
		
		System.out.println("Static variable from Class B:" + B.z);
		////System.out.println("Static variable called" + a);
		
		
		// STATIC methods are INHERTITED and OVERRIDENl.
		
		
		D objD=new D();
		objD.display();
		objD.dikhao();
		
		C.displays();   // Static methods of Interfaces will be called accesed 
		//using interface Name.
		
		// D.displays();  Static methods in interfces cannot 
		//be IMPLEMENTED using child class.
		
		E objE= new E(500,500,"Sabhya","Sourabh");
		// Contsrcutor values remain in through class
		objE.add(10,20);   // When values are passed as paramter 
		//then Contructor's values don't work.
		objE.displayE();
		E.displayss();
	
	}
}