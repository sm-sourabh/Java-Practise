//package TutorialOOPs.Tuts;


        /*ABSTRACT CONCECEPTS:--
                1. You cannot create an instance of a Abstract Class.
                2. Subclass which extends Abstract Class can be used to create instance of Abstract Class.
                3. Methods defined as abstract cannot have body.
                4.  It can have abstract and non-abstract methods (method with the body).
                */

abstract class AbstractClass{
    String s;
    int b;
    abstract void getPrint();
    void getPrintifPossible(){
        System.out.println("I am a Non-Abstract Method inside Abtsract Class , thus have Body ");
    }
}   
                    
class ChildofAbstractClass extends AbstractClass{
    void getPrint(){
        System.out.println("Body of Abstract Method is defined in Sub-class");
    }
}

class unknown{
    // abstract void show();  Non Abstract Classes cannot have Abstrcat Methods;
}

public class abstractTuts {
    public static void main(String args[]){
        // AbstractClass a=new AbstractClass();
        ChildofAbstractClass obj = new ChildofAbstractClass();
        obj.getPrint();
        obj.getPrintifPossible();
        
    }
}
