class Logic
{
    void checkEvenOdd(int num)
    {

        if((num % 2) == 0)
        {
            System.out.println("It is Even number");
        }
        else
        {
            System.out.println("It is Odd number");
        }

    }   
}

class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}