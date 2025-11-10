class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;
        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;
            System.out.println(iDigit);
        }
    }

}
class program19_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }

}