class Logic
{
    void countEvenOddRange(int num)
    {
        int iCountEven = 0;
        int iCountOdd = 0;
        int i = 0;
        for(i = 1; i <= num; i++)
        {
            if((i % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }
        System.out.println("Count of Even number is : " +iCountEven);
        System.out.println("Count of Odd number is : " +iCountOdd);
    }
}
class program21_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}