/*
I.Write a program which accept string from user and count number of
small characters.
*/

import java.util.Scanner;

class Display
{
    public void CountSmall(String str)
    {
        int i = 0;
        int no = 0;

        for( i = 0; i < str.length(); i++)
        {   
            char ch = str.charAt(i);
           if(ch >= 'a' && ch <= 'z')

            {
                no++;
            }
        }

        System.out.println("Number of small letter are " + no);
    }
}
class program2
{

    public static void main(String[] args) 
    {
         String sValue ;
        
         Scanner sobj = new Scanner(System.in);
    
         System.out.println("Enter the string");
         sValue = sobj.nextLine();

         Display dobj = new Display();
         dobj.CountSmall(sValue);
         
    }

}
