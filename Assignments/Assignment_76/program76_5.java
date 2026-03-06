import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int battery = 0;
        String status = null;

        System.out.print("Enter battery percentage (0-100): ");
        battery = sobj.nextInt();

        if (battery < 0 || battery > 100) 
        {
            System.out.println("Invalid input! Please enter a value between 0 and 100");
        }
        else 
        {
            if (battery <= 5) 
            {
                status = "Critical";
            } 
            else if (battery <= 15) 
            {
                status = "Low";
            }
            else 
            {
                status = "Normal";
            }

        System.out.println("Battery Percentage: " + battery + "%");
        System.out.println("Status: " + status);
        }

        sobj.close();
    }
}