import java.util.*;

class program75_3
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Currentstock = 0;
        int Remainingstock = 0;
        int Quantity = 0;

        System.out.println("Enter current stock : ");
        Currentstock = sobj.nextInt();

        System.out.println("Enter requested quantity : ");
        Quantity = sobj.nextInt();

        if(Currentstock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(Quantity <= 0)
        {
            System.out.println("Requested quantity must be greater than 0");
            return;
        }

        if(Quantity > Currentstock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else 
        {
            Remainingstock = Currentstock - Quantity;

            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : "+Remainingstock);

            if(Remainingstock < 5)
            {
                System.out.println("Low stock alert");
            }
        }
       
        sobj.close();
    }
}