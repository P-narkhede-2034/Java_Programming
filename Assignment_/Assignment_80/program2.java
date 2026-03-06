
import java.util.*;

class program2 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int sum = 0;

        for(int j=0;j<n;j++)
        {
            sum = sum + arr[0][j];
        }

        boolean magic = true;

        for(int i=0;i<n;i++)
        {
            int row = 0;
            for(int j=0;j<n;j++)
            {
                row = row + arr[i][j];
            }

            if(row != sum)
            {
                magic = false;
            }
        }

        for(int j=0;j<n;j++)
        {
            int col = 0;
            for(int i=0;i<n;i++)
            {
                col = col + arr[i][j];
            }

            if(col != sum)
            {
                magic = false;
            }
        }

        int d1 = 0, d2 = 0;

        for(int i=0;i<n;i++)
        {
            d1 = d1 + arr[i][i];
            d2 = d2 + arr[i][n-i-1];
        }

        if(d1 != sum || d2 != sum)
        {
            magic = false;
        }

        if(magic)
        {
            System.out.println("Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Matrix is NOT a Magic Square");
        }
    }
}
