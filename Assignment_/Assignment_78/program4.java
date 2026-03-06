
import java.util.*;

class program4 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int minutes;

        System.out.println("Enter call duration: ");
        minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid minutes");
            return;
        }

        int charge = 0;

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = (10 * 1) + (minutes - 15) * 2;
        }

        System.out.println("Call Duration: " + minutes + " minutes");
        System.out.println("Total Call Charge: Rs " + charge);
    }
}
