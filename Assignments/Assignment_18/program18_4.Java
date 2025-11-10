class Logic
{
    void sumEvenOddDigits(int n)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(n != 0)
        {
            iDigit = n % 10;
            n = n / 10;
            if((iDigit % 2) == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
        }    
        System.out.println("Sum of even digits: " + iSumEven);
        System.out.println("Sum of odd digits: " + iSumOdd);    
    }
}
class program18_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}