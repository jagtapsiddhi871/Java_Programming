class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 80)
        {
            System.out.println("The grade is A");
        }
        else if(marks >= 50)
        {
            System.out.println("The grade is B");
        }
        else
        {
            System.out.println("The grade is C");
        }
    }
}
class program19_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}