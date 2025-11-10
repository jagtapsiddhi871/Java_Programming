class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0;
        
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println(iSum);
    }    
}

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}