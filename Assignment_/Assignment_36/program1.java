/*
I.Write a program which accept string from user and convert it into
lower case.
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
            
            if( ch >= 'A' && ch <= 'Z')
            {
                System.out.printf("%c", ch + 32);
            }
            else
            {
                System.out.print(ch);
            }
        }

    }
}
class program1
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
