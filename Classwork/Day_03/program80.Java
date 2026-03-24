import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i = 0,iSum = 0;

        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }
        }
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}  // End of Number class

class program80
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.DisplayFactors(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+ "is perfect number");
        }
        else
        {
            System.out.println(iValue+ "is not perfect number");
        }

        // Important

        sobj = null;
        nobj = null;

        System.gc();
        
    }
} 