/*
4. Accept Character from user and check whether it is special symbol
or not (!, #, $, %, A, a,
*/

import java.util.Scanner;


class Convert
{
    public void Display(char ch)
    {
        if(ch  >= 0 && 9 <=ch )
        {
            System.out.println("invalid input");
            return;
        }
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
           System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
       
    }
}
class program4
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