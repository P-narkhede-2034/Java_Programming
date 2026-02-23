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
    //FUNCTION NAME : reversecolume()
    //DESCRIPTION   : revere the colume 
    //INPUT         : None
    //OUTPUT        : none 
    //AUTHOR        : Pranav Manoj Narkhede
    //DATE          : 22/02/2026
    //////////////////////////////////////////////////////////////////////////////////
    public void reversecolume()
    {
        int temp = 0;
        System.out.println("Swap the colume : ");

            for( j = 0; j < icol; j++)        // column loop
            {
                for( i = 0; i < irow/2; i++) // swap top & bottom
                {
                    temp = arr[i][j];
                    arr[i][j] = arr[irow-1-i][j];
                    arr[irow-1-i][j] = temp;
                }
            }
    }
}
class program3
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
        mobj.reversecolume();

        ssobj.close();

    }
}