
import java.util.*;

class program2 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int distance, bookingHoursBefore, age;
        String classType;

        System.out.println("Enter distance: ");
        distance = sobj.nextInt();

        System.out.println("Enter class type (Sleeper/3AC/2AC): ");
        classType = sobj.next();

        System.out.println("Enter booking hours before journey: ");
        bookingHoursBefore = sobj.nextInt();

        System.out.println("Enter age: ");
        age = sobj.nextInt();

        double baseFare;

        if(distance <= 100)
        {
            baseFare = distance * 1.5;
        }
        else if(distance <= 500)
        {
            baseFare = distance * 2;
        }
        else
        {
            baseFare = distance * 2.5;
        }

        if(classType.equalsIgnoreCase("3AC"))
        {
            baseFare += 500;
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            baseFare += 800;
        }
        else if(classType.equalsIgnoreCase("Sleeper"))
        {
            baseFare += 200;
        }

        if(bookingHoursBefore < 24)
        {
            baseFare += baseFare * 0.30;
        }

        if(age >= 60)
        {
            baseFare -= baseFare * 0.40;
        }

        System.out.println("Final Fare: " + baseFare);
    }
}
