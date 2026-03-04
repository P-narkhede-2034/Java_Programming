import java.util.Scanner;

class program5 
{
 
    public static void main(String[] args) 
    {
        int percentage = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Battery Percentage : ");
        percentage = sobj.nextInt();

        if(percentage < 0 && percentage > 100)
        {
            System.out.println("Invalid input ");
        }

        if(percentage <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(percentage <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status  : Normal");
        }
    }
}
