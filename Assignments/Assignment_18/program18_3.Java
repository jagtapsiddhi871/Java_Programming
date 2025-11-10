class Logic
{
    void printOddNmubers(int n)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt<= n; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}
class program18_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNmubers(20);
    }
}