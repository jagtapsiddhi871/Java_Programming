import java.util.*;

class program75_1
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Parkinghours = 0;
        int Amount = 0;

        System.out.println("Enter parking hours : ");
        Parkinghours = sobj.nextInt();

        if(Parkinghours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        if(Parkinghours <= 2)
        {
            Amount = 20;
        }
        else 
        {
            Amount = 20 + ((Parkinghours - 2) * 10);
        }
        
        if(Parkinghours > 10)
        {
            Amount = Amount + 50;
        }

        System.out.println("Total parking duration : "+Parkinghours);
        System.out.println("Total Parking Fee : "+Amount);

        sobj.close();

    }
}