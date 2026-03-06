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

    int AddDiagonal(int Arr[][], int iRow, int iCol, int iNo)
    {
        int i = 0, j = 0;
        int iFreq = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
               if(iNo == Arr[i][j])
               {
                 iFreq++;
               }
            }
        }

        return iFreq;
    }

}
class program72_2
{
    public static void main (String A[])
    {
        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number to search : ");
        int iNo = sobj.nextInt();

        System.out.println("Frequency of the number is : " +mobj.AddDiagonal(mobj.Arr, 4, 4, iNo));

        sobj.close();

    }
}