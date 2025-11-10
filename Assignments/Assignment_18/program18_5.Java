class Logic
{
    void checkSign(int num)
    {
        if(num < 0)
        {
            System.out.println("It is negative number");
        }
        else if(num > 0)
        {
           System.out.println("It is positive number"); 
        }
        else if(num == 0)
        {
            System.out.println("It is zero");
        }

    }
}
class program18_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}