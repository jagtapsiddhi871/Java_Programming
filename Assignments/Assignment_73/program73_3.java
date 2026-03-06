import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j =  0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row : "+(i+1));
            
            for(j =  0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void ReverseCol()
    {
        
        int j = 0, start = 0, end = 0, temp = 0;

        for(j = 0; j < iCol; j++)  
        {
            start = 0;
            end = iRow - 1;

            while(start < end)
            {
                temp = Arr[start][j];
                Arr[start][j] = Arr[end][j];
                Arr[end][j] = temp;

                start++;
                end--;
            }
        }    
    }

}
class program73_3
{
    public static void main (String A[])
    {
        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        mobj.ReverseCol();

        System.out.println("After reversing each column:");
        mobj.Display();  
    }
}