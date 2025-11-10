class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;
        int iMin = 9;

        while(num != 0)
        {
            iDigit = num % 10;        
            if(iDigit < iMin)
            {
                iMin = iDigit;       
            }
            num = num / 10;          
        }
        System.out.println("Smallest digit is: " + iMin);    
    }
    
}
class program20_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}