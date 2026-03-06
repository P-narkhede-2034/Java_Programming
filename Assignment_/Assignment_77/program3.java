
import java.util.*;

class program3 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int mins, sms;
        double gb;

        System.out.println("Enter call minutes: ");
        mins = sobj.nextInt();

        System.out.println("Enter data GB: ");
        gb = sobj.nextDouble();

        System.out.println("Enter SMS count: ");
        sms = sobj.nextInt();

        double plan1 = 199;
        double plan2 = 299;
        double plan3 = 399;
        double plan4 = 499;

        double cost1 = plan1 + Math.max(0, mins-200)*0.5 + Math.max(0, gb-1)*50 + Math.max(0, sms-100)*0.2;
        double cost2 = plan2 + Math.max(0, mins-400)*0.5 + Math.max(0, gb-2)*50 + Math.max(0, sms-200)*0.2;
        double cost3 = plan3 + Math.max(0, mins-800)*0.5 + Math.max(0, gb-5)*50 + Math.max(0, sms-500)*0.2;
        double cost4 = plan4;

        double min = cost1;
        String plan = "Plan1";

        if(cost2 < min){ min = cost2; plan="Plan2"; }
        if(cost3 < min){ min = cost3; plan="Plan3"; }
        if(cost4 < min){ min = cost4; plan="Plan4"; }

        System.out.println("Recommended Plan: " + plan);
        System.out.println("Total Cost: " + min);
    }
}
