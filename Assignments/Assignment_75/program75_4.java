import java.util.*;

class program75_4
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine = 0;
        String Helmet = null;
        String License = null;
        String Overspeed = null;

        System.out.println("Helmet worn : ");
        Helmet = sobj.next();

        System.out.println("License available : ");
        License = sobj.next();

        System.out.println("Overspeeding : ");
        Overspeed = sobj.next();

        if(!(Helmet.equalsIgnoreCase("Yes") || Helmet.equalsIgnoreCase("No")) || 
           !(License.equalsIgnoreCase("Yes") || License.equalsIgnoreCase("No")) ||
           !(Overspeed.equalsIgnoreCase("Yes") || Overspeed.equalsIgnoreCase("No")))
        {
        System.out.println("Invalid Input! Enter Yes or No only");
        }

        if(Helmet.equalsIgnoreCase("No"))
        {
            Fine = Fine + 500;
        }  

        if(License.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }

        if(Overspeed.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount :" +Fine);

        sobj.close();
    }
}