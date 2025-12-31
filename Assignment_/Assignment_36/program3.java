/*
3.Write a program which accept string from user and toggle the case.
*/

import java.util.Scanner;

class Display
{
    public void strlwrx(String str)
    {
        int i = 0;

        for( i  = 0; i < str.length(); i ++)
        {   
            char ch = str.charAt(i);
            
            if( ch >= 'a' && ch <= 'z')
            {
                System.out.printf("%c", ch - 32);
            }
            else
            {
                 System.out.printf("%c", ch + 32);
            }
        }

    }
}
class program3
{

    public static void main(String[] args) 
    {
         String sValue ;
        
         Scanner sobj = new Scanner(System.in);
    
         System.out.println("Enter the string");
         sValue = sobj.nextLine();

         Display dobj = new Display();
         dobj.strlwrx(sValue);
         
    }

}
