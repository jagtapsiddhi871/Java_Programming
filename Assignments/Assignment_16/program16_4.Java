class Logic
{
    void reverseNumber(int num)
    {
        int iDigit = 0;

        int rev = 0;

        while(num !=0 )
        {
            iDigit = num % 10;
            
            num = num / 10;

            rev = rev * 10 + iDigit;

        }
        
        System.out.println(rev);   
    }   
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}