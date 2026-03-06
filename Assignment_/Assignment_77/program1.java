
import java.util.*;

class program1 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int days;
        double medicineBill, consultationFee;
        String wardType, insured;

        System.out.println("Enter days: ");
        days = sobj.nextInt();

        System.out.println("Enter ward type (Normal/ICU): ");
        wardType = sobj.next();

        System.out.println("Enter medicine bill: ");
        medicineBill = sobj.nextDouble();

        System.out.println("Enter consultation fee: ");
        consultationFee = sobj.nextDouble();

        System.out.println("Insured (Yes/No): ");
        insured = sobj.next();

        double roomCharge = 0;

        if(wardType.equalsIgnoreCase("Normal"))
        {
            roomCharge = days * 2000;
        }
        else if(wardType.equalsIgnoreCase("ICU"))
        {
            roomCharge = days * 5000;
        }
        else
        {
            System.out.println("Invalid ward type");
            return;
        }

        double totalBill = medicineBill + consultationFee + roomCharge;
        double insuranceCover = 0;

        if(insured.equalsIgnoreCase("Yes"))
        {
            double seventy = totalBill * 0.7;
            if(seventy < 50000)
            {
                insuranceCover = seventy;
            }
            else
            {
                insuranceCover = 50000;
            }
        }

        double finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Insurance Cover: " + insuranceCover);
        System.out.println("Final Pay: " + finalPay);
    }
}
