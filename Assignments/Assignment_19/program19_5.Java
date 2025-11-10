class Logic
{
    void calculatePower(int base, int exp)
    {
        int i = 1;
        int iPower = 1;
        for(i = 1; i<= exp; i++)
        {
            iPower = iPower * base;   
        }
        System.out.println(iPower);
    }
}
class program19_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}