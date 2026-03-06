import java.util.*;

class program75_5
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        int Originalincome = 0;
        float Tax = 0.0f;

        System.out.println("Enter annual income : ");
        Income = sobj.nextInt();

        Originalincome = Income;

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Income > 1000000)
        {
            Tax = Tax + (Income - 1000000) * 0.3f;
            Income = 1000000; 
        }
        
        if(Income > 500000)
        {
            Tax += (Income - 500000) * 0.2f;
            Income = 500000;
        }

        if(Income > 250000)
        {
            Tax += (Income - 250000) * 0.05f;
        }

        System.out.println("Annual Income : ₹" + originalIncome);
        System.out.println("Total Tax Payable : ₹" + Tax);

        sobj.close();
    }
}