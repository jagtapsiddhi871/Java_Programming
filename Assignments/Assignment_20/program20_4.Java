class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0;
        int iMax = 0;

        while(num != 0)
        {
            iDigit = num % 10;        
            if(iDigit > iMax)
            {
                iMax = iDigit;       
            }
            num = num / 10;          
        }
        System.out.println("Largest digit is: " + iMax);    
    }

}
class program20_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}