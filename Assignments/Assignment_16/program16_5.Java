class Logic
{
    void countDigits(int num)
    {
        int iDigit = 0;

        int iCnt = 0;

        while(num !=0 )
        {
            iDigit = num % 10;
            
            num = num / 10;
            
            iCnt++;
        }
        
        System.out.println(iCnt);   
    }   
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}