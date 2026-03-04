import java.util.Scanner;

class program4 
{
    public static void main(String[] args) 
    {
        int budget = 0;
        int Number_item = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Your Buget : ");
        budget = sobj.nextInt();

        System.out.println("How many item do you want to purches :");
        Number_item = sobj.nextInt();

        int arr[] = new int[Number_item];

        System.out.println("Enter the each item price :");


        for(i = 0 ; i < Number_item ; i++)
        {
            arr[i] = sobj.nextInt();
        }

        i= 0;
        while (budget > arr[i])
        {
            budget = budget - arr[i];
            i++;
        }

        System.out.println("Iteam Pearches = " + i + " item only");
        System.out.println( "Remaining balance" + budget);

        sobj.close();
    
    }    
}
