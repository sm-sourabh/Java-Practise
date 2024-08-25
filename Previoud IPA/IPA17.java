//package IPA17;

import java.util.*;
public class IPA17
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stud> students = new ArrayList<>();

        for (int i = 0; i < 4; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            
            students.add( new Stud(a,b,c,d,e));
        }
        char req_grade = sc.nextLine().charAt(0);
        int req_roll = sc.nextInt();sc.nextLine();
        ArrayList<Stud> res = findStudent(s,req_grade,req_roll);
        
            for (Stud i: res) 
            {
                System.out.println(i.name());
                System.out.println(i.subject());
            }
            System.out.println(ans1.length);
        }
        else
        {
            System.out.println("No student found");
        }*/
    }
    public static ArrayList<Stud> findStudent(ArrayList<Stud> students, char req_grade, int req_roll)
    {
        ArrayList<Stud> temp=new ArrayList<>();
        for(Stud s: students){
            int num = Integer.parseInt(s.find(s.date));
            if(num==req_roll && req_grade==s.grade){
                    temp.add(s);
            }
        }
        return temp;
    }
}    


class Stud
{
    int roll;
    String name;
    String sub;
    char grade;
    String date;

    public Stud(int roll, String name, String sub, char grade, String date)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;
    }
    public String find(String s){
        return s.substring(3,5);
    }
}