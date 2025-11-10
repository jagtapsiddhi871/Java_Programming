class Logic
{
    void productDigits(int num)
    {
        int iDigit = 0;
        int iMult = 1;
        while(num != 0)
        {
            iDigit = num % 10;
            iMult = iMult * iDigit;
            num = num / 10;
        }
        System.out.println("Product of digits of a number is :"+iMult);

    }

}
class program21_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productDigits(234);
    }
}