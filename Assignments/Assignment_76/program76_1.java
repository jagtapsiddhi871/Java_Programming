import java.util.*;

class program76_1
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        double TotalFare = 0.0;
        String Peak = null;

        System.out.println("Enter the distance in Km : ");
        Distance = sobj.nextInt();

        if(Distance < 0)
        {
            System.out.println("Distance cannot be negative");
            return;
        }

        System.out.println("Is it peak hour? (Yes/No) : ");
        Peak = sobj.next();

        TotalFare = 50;

        if(Distance <= 10)
        {
            TotalFare = TotalFare + (Distance * 12);
        }
        else
        {
            TotalFare = TotalFare + (10 * 12);
            TotalFare = TotalFare + ((Distance - 10) * 15);
        }

        if(Peak.equalsIgnoreCase("Yes"))
        {
            TotalFare = TotalFare + (TotalFare * 0.20);
        }

        System.out.println("Distance: " + Distance + " km");
        System.out.println("Peak Hour: " + Peak);
        System.out.println("Total Fare: " + TotalFare);

        sobj.close();
    }
}