class Logic
{
    void checkPrime(int num)
    {
        if (num <= 1) {
            System.out.println("Number is not prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println("Number is prime");
        } 
        else 
        {
            System.out.println("Number is not prime");
        }
    }
}
class program18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}