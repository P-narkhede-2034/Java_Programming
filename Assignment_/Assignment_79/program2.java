
import java.util.*;

class program2 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int r = sobj.nextInt();
        int c = sobj.nextInt();

        if(r <= 0 || c <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[r][c];

        int total = 0;
        int maxRow = 0;
        int maxCount = 0;
        boolean fullRow = false;

        for(int i=0;i<r;i++)
        {
            int rowCount = 0;

            for(int j=0;j<c;j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }

                if(arr[i][j] == 1)
                {
                    total++;
                    rowCount++;
                }
            }

            if(rowCount > maxCount)
            {
                maxCount = rowCount;
                maxRow = i;
            }

            if(rowCount == c)
            {
                fullRow = true;
            }
        }

        System.out.println("Total Booked Seats: " + total);
        System.out.println("Row With Maximum Bookings: Row " + (maxRow+1));

        if(fullRow)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
