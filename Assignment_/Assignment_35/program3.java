/*
3. Write a program which accept string from user and return
difference between frequency of small characters and frequency of
capital characters.
*/

import java.util.Scanner;

class Display
{
    public void DisplayDifference(String str)
    {
        int i = 0;
        int capital = 0;
        int small = 0;

        for( i = 0; i < str.length(); i++)
        {   
            char ch = str.charAt(i);
           if(ch >= 'A' && ch <= 'Z')

            {
                capital++;
            }
            else
            {
                small++;
            }
        }

        System.out.println("Number of cptial letter are " + (capital - small));
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
         dobj.DisplayDifference(sValue);
         
    }

}
