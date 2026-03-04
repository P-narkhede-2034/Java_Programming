import java.util.Scanner;

class program2 
{
    public static void main(String[] args) 
    {
       int Marks = 0;
        int Attandence = 0;    
        int Income = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the percentage ");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendance in percentage");
        Attandence = sobj.nextInt();

        System.out.println("Enter the anual income");
        Income = sobj .nextInt();

        if(Marks > 100 || Marks < 0)
        {
            System.out.println("Invalid input ");
        }

        if(Marks < 80)
        {
            System.out.println("Scholeship Reject : your marks less than 80%" );
        }
        else if(Attandence < 75)
        {
            System.out.println("Scholeship Reject : your attandence less then 75%");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholeship Reject : your anual income more than  300000");
        }
        else
        {
            System.out.println("Scholership Accept");
        }

    }
}
