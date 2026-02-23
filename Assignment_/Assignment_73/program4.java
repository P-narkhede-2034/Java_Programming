import java.util.Scanner;

class Matrix
{
    int arr[] [];
    int icol ;
    int irow;
    int i , j;

     //////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME : Matrix
    // DESCRIPTION   : Constructor to initialize rows and columns of matrix
    //INPUT         : a, b
    //OUTPUT        : None
    //AUTHOR        : Pranav Manoj Narkhede
    //DATE          : 22/02/2026
    //////////////////////////////////////////////////////////////////////////////////
    public Matrix(int a , int b)
    {
        irow = a;
        icol = b;
        i = 0 ;
        j = 0;

        arr = new int[irow][icol];
    }

    //////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME : Accept
    //DESCRIPTION   : Accept matrix elements from user
    //INPUT         : None
    //OUTPUT        : None
    //AUTHOR        : Pranav Manoj Narkhede
    //DATE          : 22/02/2026
    //////////////////////////////////////////////////////////////////////////////////
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value into the matrix");

        for(i = 0; i < irow; i++)
        {
            System.out.println("Enter value for " + ( i + 1) + " row");
            for(j = 0; j < icol ; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    //////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME : Display
    //DESCRIPTION   : Display matrix elements
    //INPUT         : None
    //OUTPUT        : None
    //AUTHOR        : Pranav Manoj Narkhede
    //DATE          : 22/02/2026
    //////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {
        System.out.println("Print the matrix");

        for(i = 0; i< irow ; i++)
        {
            for(j = 0; j < icol ; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
//////////////////////////////////////////////////////////////////////////////////
//FUNCTION NAME : CheckIdentity
//DESCRIPTION   : Check whether matrix is identity matrix
//INPUT         : None
//OUTPUT        : None
//AUTHOR        : Pranav Manoj Narkhede
//DATE          : 23/02/2026
//////////////////////////////////////////////////////////////////////////////////
public void CheckIdentity()
{
    if(irow != icol)
    {
        System.out.println("Not an Identity Matrix ");
        return;
    }

    for(int i = 0; i < irow; i++)
    {
        for(int j = 0; j < icol; j++)
        {
            if(i == j && arr[i][j] != 1)
            {
                System.out.println("Not an Identity Matrix");
                return;
            }
        }
    }

    System.out.println("Matrix is Identity Matrix");
}
}
class program4
{
    public static void main(String[] args) 
    {
        int row = 0;
        int col = 0;
        int iret = 0;
        
        Scanner ssobj = new Scanner(System.in);

        System.out.println("Enter the row to create matrix");
        row = ssobj.nextInt();

        System.out.println("Enter the column to create matrix");
        col = ssobj.nextInt();
        
        Matrix mobj = new Matrix(row, col);

        mobj.Accept();
        mobj.Display();
        mobj.CheckIdentity();

        ssobj.close();

    }
}