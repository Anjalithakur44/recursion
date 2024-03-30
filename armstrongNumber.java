public class armstrongNumber {
    public static int aN(int number)
    {
        int sum=0,dig=0,origNumber=number;
        boolean res=false;
        while(number>0)
        {
            dig=(number%10);
            sum=sum+(dig*dig*dig);
            number =number/10;
        }
        if (sum==origNumber)
        {
            res=true;
            System.out.println(origNumber+" is an Armstrong Number");
            return sum;
        }
        else
        {
            System.out.println(origNumber+" is not an armstrong number.");
        }
        return -1;
    }
    public static void main(String[] args) {
        int number=153;
        int result=aN(number);
        System.out.println("The output is="+result);
    }
    
}
