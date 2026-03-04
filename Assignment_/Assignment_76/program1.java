import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        int Distance = 0;
        char Peak_Hour = '\0';
        int Fare = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Disatnce in KM : ");
        Distance = sobj.nextInt();

        System.out.println("Peak Hour (Y / N): ");
        Peak_Hour = sobj.next().charAt(0);

        if(Distance < 0)
        {
            System.out.println("Invalid input !!");
        }

        if(Distance < 10)
        {
            Fare = 50 + (Distance * 12);
            if(Peak_Hour == 'Y')
            {
                double extra = (Fare *  0.2);
                System.out.println("Total Fare : " + (Fare + extra));
                return;
            }
            
            System.out.println("Toral Fare : " + Fare);
        }
        else
        {
            Fare = 50 + (Distance * 15);
            if(Peak_Hour == 'Y')
            {
                double extra = (Fare *  0.2);
                System.out.println("Total Fare : " + (Fare + extra));
                return;
            }
            
            System.out.println("Toral Fare : " + Fare);
        }

        sobj.close();
    }
}