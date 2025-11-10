class Logic
{
    void printReverse(int n)
    {
        int i = 0;
        for(i = n; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
    
}
class program20_2
{
    public static void main(String A [])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}