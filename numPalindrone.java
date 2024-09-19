import java.util.*;
public class numPalindrone{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        int rem=0;
        while (n != 0) {
      rem = n % 10;
      rev = rev* 10 + rem;
      n=n/10;
    }
    if (org==rev){
        System.out.println("yes,palindrome");
    }
    else{
        System.out.println("no");
    }
    }
}
