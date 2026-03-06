
import java.util.*;

class program1 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();
        int m = sobj.nextInt();

        if(n <= 0 || m <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0 || arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int total[] = new int[n];

        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                sum = sum + arr[i][j];
            }
            total[i] = sum;
        }

        System.out.println("Student Totals:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Student " + (i+1) + ": " + total[i]);
        }

        int max = total[0];
        int topper = 0;

        for(int i=1;i<n;i++)
        {
            if(total[i] > max)
            {
                max = total[i];
                topper = i;
            }
        }

        System.out.println("Topper: Student " + (topper+1));

        System.out.println("Subject Averages:");
        for(int j=0;j<m;j++)
        {
            double sum = 0;
            for(int i=0;i<n;i++)
            {
                sum = sum + arr[i][j];
            }

            double avg = sum / n;
            System.out.print("Subject %d: %.2f\n", (j+1), avg);
        }

        System.out.println("Students Failed:");
        for(int i=0;i<n;i++)
        {
            boolean fail = false;

            for(int j=0;j<m;j++)
            {
                if(arr[i][j] < 35)
                {
                    fail = true;
                }
            }

            if(fail)
            {
                System.out.println("Student " + (i+1));
            }
        }
    }
}
