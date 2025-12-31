/*
I.Write a program which accept string from user and count number of
capital characters.
*/

import java.util.Scanner;

class Display
{
    public void CountCapital(String str)
    {
        int i = 0;
        int no = 0;

        for( i = 0; i < str.length(); i++)
        {   
            char ch = str.charAt(i);
           if(ch >= 'A' && ch <= 'Z')

            {
                no++;
            }
        }

        System.out.println("Number of cptial letter are " + no);
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
         dobj.CountCapital(sValue);
         
    }

}
