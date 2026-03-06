
import java.util.*;

class program3 {
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

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] != 0 && arr[i][j] != -1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        boolean dp[][] = new boolean[r][c];

        if(arr[0][0] == 0)
        dp[0][0] = true;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == -1)
                continue;

                if(i > 0 && dp[i-1][j])
                dp[i][j] = true;

                if(j > 0 && dp[i][j-1])
                dp[i][j] = true;
            }
        }

        if(dp[r-1][c-1])
        {
            System.out.println("Path Available");
        }
        else
        {
            System.out.println("No Path Found");
        }
    }
}
