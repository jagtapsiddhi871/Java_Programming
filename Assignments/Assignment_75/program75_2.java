import java.util.*;

class program75_2
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Monthlyincome = 0;
        int Creditscore = 0;

        String Unpaidloan = null;

        System.out.println("Enter customer's age : ");
        Age = sobj.nextInt();

        System.out.println("Enter customer's monthlyincome : ");
        Monthlyincome = sobj.nextInt();

        System.out.println("Enter Credit score : ");
        Creditscore = sobj.nextInt();

        System.out.println("Enter Existing unpaid loan : (Yes/No) ");
        Unpaidloan = sobj.next();

        if(Age < 0 || Monthlyincome < 0 || Creditscore < 0)
        {
            System.out.println("Age/Monthlyincome/Creditscore must be non-negative");
            return;
        }

        if(!(Unpaidloan.equalsIgnoreCase("Yes") || Unpaidloan.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid input for unpaid loan. Enter Yes or No only");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age not eligible");
        }
        else if(Monthlyincome < 25000)
        {
            System.out.println("Loan Rejected : Monthly income less than 25000");
        }
        else if(Creditscore < 700)
        {
            System.out.println("Loan Rejected : Credit score below 700");
        }
        else if(Unpaidloan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : Existing unpaid loan present");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}