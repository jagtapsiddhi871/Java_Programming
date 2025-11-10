class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0;
        int i = 0;

        for(i = 1; i <= num; i++)
        {
            if((num % i) == 0)
            {
                iCnt++;
            }
        }
        System.out.println("Number of factors: " + iCnt);
    }

}
class program21_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}