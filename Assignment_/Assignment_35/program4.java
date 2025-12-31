/*
4. Write a program which accept string from user and check whether
it contains vowels in it or not.
*/

import java.util.Scanner;

class Display
{
    public void CheckVowel(String str)
    {
        int i = 0;
        int no = 0;
        for( i = 0; i < str.length(); i++)
        {   
            char ch = str.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

            {
                System.out.println("TRUE");
                return;
            }
            else
            {
                no ++;
            }

        }

        
        if(no != 0)
        {
            System.out.println("FALSE");
        }

    }
}
class program4
{

    public static void main(String[] args) 
    {
         String sValue ;
        
         Scanner sobj = new Scanner(System.in);
    
         System.out.println("Enter the string");
         sValue = sobj.nextLine();

         Display dobj = new Display();
         dobj.CheckVowel(sValue);
         
    }

}
