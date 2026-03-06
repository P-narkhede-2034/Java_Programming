
import java.util.*;

class program4 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int units, weeksLate;

        System.out.println("Enter water units: ");
        units = sobj.nextInt();

        System.out.println("Weeks late: ");
        weeksLate = sobj.nextInt();

        double bill = 50; // meter charge

        if(units <= 100)
        {
            bill += units * 2;
        }
        else if(units <= 300)
        {
            bill += (100*2) + (units-100)*3;
        }
        else
        {
            bill += (100*2) + (200*3) + (units-300)*5;
        }

        double penalty = weeksLate * 0.02;

        if(penalty > 0.10)
        {
            penalty = 0.10;
        }

        bill = bill + (bill * penalty);

        System.out.println("Bill Amount: " + bill);
    }
}
