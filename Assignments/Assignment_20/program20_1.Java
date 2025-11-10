class Logic
{
    void sumEvenNumbers(int n)
    {
        int i = 0;
        int iSum = 0;
        for(i = 0; i <= n; i++)
        {
            if((i % 2) == 0)
            {
                iSum = iSum + i;
            }
        }
        System.out.println(iSum);
    }
}
class program20_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}