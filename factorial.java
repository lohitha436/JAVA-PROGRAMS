import java.util.*;
public class factorial{
    public static void main(String[] args){
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of "+n+" is "+fact);
}
}
