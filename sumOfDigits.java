import java.util.*;
import java.io.*;
public class sumOfDigits {
    public static int sod(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n%10 + sod(n/10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        n=sc.nextInt();
        int result=sod(n);
        System.out.println("The output is="+result);

    }
}
