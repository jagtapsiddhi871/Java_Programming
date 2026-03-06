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

    public void AddColumn()
    {
        int i = 0, j = 0;
        int iSum = 0;

        System.out.println("Addition of elements of each column is : ");

        for(j = 0; j < iCol; j++)   
        {
            iSum = 0;              

            for(i = 0; i < iRow; i++)   
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Column " + (j+1) + " sum : " + iSum);
        }
    }

}
class program72_4
{
    public static void main (String A[])
    {
        Matrix mobj = new Matrix(4, 4);

        mobj.Accept();
        mobj.Display();

        mobj.AddColumn();

    }
}