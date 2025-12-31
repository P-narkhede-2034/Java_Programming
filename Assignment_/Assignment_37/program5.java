/*
5. Write a program which accept string from user reverse that string
in place.
*/
import java.util.Scanner;

class Display
{
    public void Reverse(String str)
    {
        int i = 0;

        for( i = str.length() - 1; i >= 0 ; i--)
        {   
            char ch = str.charAt(i);
           System.out.print( ch);
        }

    }
}
class program5
{

    public static void main(String[] args) 
    {
         String sValue ;
        
         Scanner sobj = new Scanner(System.in);
    
         System.out.println("Enter the string");
         sValue = sobj.nextLine();

         Display dobj = new Display();
         dobj.Reverse(sValue);
         
    }
}