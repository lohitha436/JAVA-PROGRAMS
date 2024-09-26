import java.util.*;
public class Highscore {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Scanner s= new Scanner(System.in);
        System.out.println("enter name of student 1");
        String n1=sc.nextLine();
        System.out.println("enter subject 1 marks");
        int e1=sc.nextInt();
        System.out.println("enter subject 2 marks");
        int m1=sc.nextInt();
        int t1=e1+m1;
        System.out.println("enter name of student 2");
        String n2=s.nextLine();
        System.out.println("enter subject 1 marks");
        int e2=s.nextInt();
        System.out.println("enter subject 2 marks");
        int m2=s.nextInt();
        int t2=e2+m2;
        if (t1>t2){
            System.out.println("the name of student with highest marks is "+n1+" and the marks are "+t1);
        }
        else{
            System.out.println("the name of student with highest marks is "+n2+" and the marks are "+t2);
        }



    }
    
}
