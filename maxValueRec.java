import java.util.*;
import java.io.*;
public class maxValueRec {
    public static int findMax(int a[],int n)
    {
        if(n==1)
        {
            return a[0];
        }
        else
        {
            return Math.max(a[n-1],findMax(a,n-1)); 
        }
    }
    public static void main(String[] args) {
        int a[]={13,1,-3,22,5};
        int n=a.length;
        int result=findMax(a,n);
        System.out.println("The output is="+result);
    }
    
}
