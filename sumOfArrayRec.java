public class sumOfArrayRec {
    public static int sumOfArray(int a[],int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return sumOfArray(a,n-1)+a[n-1];
        }
    }
    public static void main(String[] args) {
        int a[]={92,23,15,-20,10};
        int n=a.length;
        int result=sumOfArray(a,n);
        System.out.println("The output is="+result);
    }
}
