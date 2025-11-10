class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4) == 0)
        {
            System.out.println(year + "is Leap year");
        }
        else
        {
            System.out.println(year + "is not Leap year");
        }

    }
}
class program19_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

