import java.util.Scanner;

class program2 
{
    public static void main(String[] args) 
    {
        int Age = 0;
        int Income = 0 , Score = 0;
        char UnpaidLoan = '\0';
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the age : ");
        Age = sobj.nextInt();

        if(Age <= 0)
        {
            System.out.println("Invalid Input !");
            sobj.close();
            return;
        }

        System.out.println("Enter the monthly salary :");
        Income = sobj.nextInt();

        if(Income <= 0)
        {
             System.out.println("Invalid Input !");
            sobj.close();
             return;
        }

        System.out.println("Enter the credit score :");
        Score = sobj.nextInt();

        if(Score <= 0)
        {
             System.out.println("Invalid Input !");
             sobj.close();
             return;
        }

        System.out.println("Existing unpaid loan : (Y / N)");
        UnpaidLoan = sobj.next().charAt(0);

        if(UnpaidLoan != 'Y' && UnpaidLoan != 'N')
        {
            System.out.println("Invalid Input Enter (Y / N)");
            sobj.close();
            return;
        }


        if(Age <= 21 || Age >= 60)
        {
            System.out.println("Loan Reject : Age must be between 21 and 60.");
            return;
        }
        else if(Income <= 25000)
        {
            System.out.println("Loan Reject : Monthly salary greater than 25000");
             return;
        }
        else if(Score < 700)
        {
            System.out.println("Loan Reject : Your credit score are low");
             return;
        }
        else if(UnpaidLoan == 'Y')
        {
            System.out.println("Loan Reject : You have Unpaid Loan");
             return;
        }

        System.out.println("Loan Approved ");
        sobj.close();
    }
}
