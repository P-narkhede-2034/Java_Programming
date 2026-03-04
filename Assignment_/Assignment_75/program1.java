import java.util.Scanner;

class program1
{
    public static void main(String argc[])
    {
        int Time = 0;
        int ExtraHours = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Duration : ");
        Time = sobj.nextInt();

        if(Time <= 0)
        {
            System.out.println("Invalid input !");
        }

        if( Time > 0 && Time <= 2)
        {
            System.out.println("Total Parking Fees : Rs 20 ");
        }
        else if(Time > 2 && Time <= 10)
        {
            ExtraHours = Time - 2;
            System.out.println("Total Parking Fees : " + "Rs" + (20 + (ExtraHours * 10)));
        }
        else if(Time > 10)
        {
             ExtraHours = Time - 2;
            System.out.println("Total Parking Fees : " + "Rs" + (20 + (ExtraHours * 10) + 50));
        }
        sobj.close();
    }
}