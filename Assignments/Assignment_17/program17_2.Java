class Logic
{
    void checkPalindrome(int num)
    {
        int iOriginalnum = num;
        int iRev = 0;
        
        while(num != 0)
        {
            int iDigit = num % 10;
            iRev = iRev * 10 + iDigit;
            num = num / 10;
        }
        if (iRev == iOriginalnum) 
        {
            System.out.println("It is a palindrome number");
        }
        else 
        {
            System.out.println("It is not a palindrome number");
        }
    }
}
class program17_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}