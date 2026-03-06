
import java.util.*;

class program1 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int days;

        System.out.println("Enter number of days stayed: ");
        days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid days");
            return;
        }

        double bill = days * 3000;

        if(days > 7)
        {
            bill = bill - (bill * 0.05);
        }

        System.out.println("Total Stay Duration: " + days + " days");
        System.out.println("Final Bill Amount: Rs " + bill);
    }
}
