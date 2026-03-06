import java.util.*;

class program76_2
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter Marks : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Income : ");
        Income = sobj.nextInt();

        if(Marks < 0 || Marks > 100 || Attendance < 0 || Attendance > 100)
        {
            System.out.println("Invalid input: Marks and Attendance must be between 0 to 100");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Invalid input: Income cannot be negative");
            return;
        }

        if(Marks >= 80 && Attendance >= 75 && Income <= 300000)
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            if(Marks < 80)
                System.out.println("Scholarship Rejected: Marks less than 80");

            if(Attendance < 75)
                System.out.println("Scholarship Rejected: Attendance less than 75");

            if(Income > 300000)
                System.out.println("Scholarship Rejected: Income more than 300000");
        }

        sobj.close();
    }
}