/*
3. Accept character from user. If it is capital then display all the
characters from the input characters till Z. If input character is small
then print all the characters in reverse order till a. In other cases
return directly.
*/

import java.util.Scanner;


class Convert
{
    public void Display(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            int i = 0;

            for(i = ch ; i <= 'z' ; i++)
            {
                System.out.printf("%c\t", ch);
                ch++;
            }
           
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
             int i = 0;

            for(i = ch ; i <= 'Z' ; i++)
            {
                System.out.printf("%c\t", ch);
                ch++;
            }
        }
        else 
        {
            System.out.println("invlid input try only aplphabets");
        }
    }
}
class program3
{
    public static void main(String[] args) 
    {
        char Cvalue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the charater");
        Cvalue = sobj.next().charAt(0);

        Convert cobj = new Convert();
        cobj.Display(Cvalue);

    }
}