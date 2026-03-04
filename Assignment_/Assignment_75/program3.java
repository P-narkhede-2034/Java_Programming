import java.util.Scanner;

class program3
{
    public static void main(String[] args) 
    {
        int Current_Stock = 0;
        int Request_Quantity = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the current stock");
        Current_Stock = sobj.nextInt();

        System.out.println("Enter the Request quantity");
        Request_Quantity = sobj.nextInt();
        
        if(Current_Stock <= 0 || Request_Quantity <= 0)
        {
            System.out.println("Invalid input");
        }

        if(Request_Quantity > Current_Stock)
        {
            System.out.println("Order Failed : Insuffcient Stock");
        }

        if((Current_Stock - Request_Quantity) >= 5)
        {
            System.out.println("Order Processed successfully");
            System.out.println("Remaning Stock : "+ (Current_Stock - Request_Quantity));
        }
        else
        {
            System.out.println("Low stock alret !");
        }
        sobj.close();
    }
}
