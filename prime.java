import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if (n%i==0){
                count++;
          }
        }
        if (count>1){
                    System.out.println("not prime");
                }
        else{
                    System.out.println("prime");
                }
            }
            }
