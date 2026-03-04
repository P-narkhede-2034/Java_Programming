import java.util.Scanner;

class program3
{
    public static void main(String[] args) 
    { 
        int Weight = 0;
        
        Scanner sobj = new Scanner(System.in);  

        System.out.println("Parcel weight : ");
        Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Invalid input !");
        }

        if(Weight == 1)
        {
            System.out.println("Courier charge : 50 RS ");
        }

        if((Weight > 1) && (Weight <= 5) )
        {
            int charge = 50;
            System.out.println("Courier Charge : " + (charge + 20));
        }

        if(Weight > 5)
        {
            System.out.println("Courier Charge : " + (150 + 30));
        }

    }
}
