import java.util.*;
import java.io.*;
public class alternateSumseries {
    public static int aSs(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
           if(n%2==0)
           {
            return aSs(n-1)-n;
           }
           else
           {
             return aSs(n-1)+n;
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,result;
        System.out.println("Enter the number=");
        n=sc.nextInt();
        result=aSs(n);
        System.out.println("The output is="+result);
    }
}
