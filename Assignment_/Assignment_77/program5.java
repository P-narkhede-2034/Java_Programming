
import java.util.*;

class program5 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int rows, cols;

        System.out.println("Enter rows: ");
        rows = sobj.nextInt();

        System.out.println("Enter cols: ");
        cols = sobj.nextInt();

        int[][] seats = new int[rows][cols];

        System.out.println("Enter number of already booked seats: ");
        int booked = sobj.nextInt();

        for(int i=0;i<booked;i++)
        {
            int r = sobj.nextInt();
            int c = sobj.nextInt();
            seats[r][c] = 1;
        }

        System.out.println("Enter number of seats you want: ");
        int req = sobj.nextInt();

        int total = 0;
        boolean fail = false;

        for(int i=0;i<req;i++)
        {
            int r = sobj.nextInt();
            int c = sobj.nextInt();

            if(seats[r][c] == 1)
            {
                fail = true;
            }
            else
            {
                seats[r][c] = 1;
                total += (r+1) * 100;
            }
        }

        if(fail)
        {
            System.out.println("Booking Failed (Seat already booked)");
            return;
        }

        if(req >= 6)
        {
            total = (int)(total * 0.9);
        }

        int remaining = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(seats[i][j] == 0)
                remaining++;
            }
        }

        System.out.println("Booking Success");
        System.out.println("Total Cost: " + total);
        System.out.println("Remaining Seats: " + remaining);
    }
}
