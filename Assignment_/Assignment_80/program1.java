
import java.util.*;

class program1 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[n][7];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int total[] = new int[n];

        System.out.println("Weekly Consumption:");

        for(int i=0;i<n;i++)
        {
            int sum = 0;

            for(int j=0;j<7;j++)
            {
                sum = sum + arr[i][j];
            }

            total[i] = sum;
            System.out.println("City " + (i+1) + ": " + sum);
        }

        int max = total[0];
        int city = 0;

        for(int i=1;i<n;i++)
        {
            if(total[i] > max)
            {
                max = total[i];
                city = i;
            }
        }

        System.out.println("Highest Consumption: City " + (city+1));

        int peakDay = 0;
        int peakValue = 0;

        for(int j=0;j<7;j++)
        {
            int sum = 0;

            for(int i=0;i<n;i++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > peakValue)
            {
                peakValue = sum;
                peakDay = j;
            }
        }

        System.out.println("Peak Consumption Day: Day " + (peakDay+1));

        System.out.println("Cities Consuming More Than 500 Units:");

        for(int i=0;i<n;i++)
        {
            if(total[i] > 500)
            {
                System.out.println("City " + (i+1));
            }
        }
    }
}
