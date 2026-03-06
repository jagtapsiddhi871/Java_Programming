import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int budget = 0;
        int n = 0;
        int count = 0;

        System.out.print("Enter Budget: ");
        budget = sobj.nextInt();

        System.out.print("Enter Number of Items: ");
        n = sobj.nextInt();

        if(budget < 0)
        {
            System.out.println("Invalid Budget");
            return;
        }

        if(n < 0)
        {
            System.out.println("Invalid Number of Items");
            return;
        }

        int prices[] = new int[n];

        System.out.println("Enter Item Prices:");
        for(int i = 0; i < n; i++)
        {
            prices[i] = sobj.nextInt();

            if(prices[i] <= 0)
            {
                System.out.println("Invalid Price");
                return;
            }
        }

        int remaining = budget;

        for(int i = 0; i < n; i++)
        {
            if(remaining >= prices[i])
            {
                remaining = remaining - prices[i];
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: " + remaining);

        sobj.close();
    }
}