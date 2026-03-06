import java.util.*;

class program76_3
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Amount = 0;

        System.out.println("Enter parcel weight in Kg : ");
        Weight = sobj.nextInt();

        if(Weight <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Weight <= 1)
        {
            Amount = 50;
        }
        else if(Weight <= 5)
        {
            Amount = 50 + ((Weight - 1) * 20);
        }
        else
        {
            Amount = 150 + ((Weight - 5) * 30);
        }

        System.out.println("Parcel Weight : "+Weight + "kg");
        System.out.println("Courier Charge : "+Amount);

        sobj.close();
    }
}