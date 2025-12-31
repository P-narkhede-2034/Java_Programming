/*
4. Accept Character from user and check whether it is small case or
not (a-z).
 */

import java.util.Scanner;

class chekapha
{
    public boolean check(char ch)
     {
       
       if(ch >= 'a' && ch <= 'a') 
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
}

class program4
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        char charater = 0;
        boolean bret = false;

        System.out.println("Enter the charater check captial or not");
        charater = sobj.next().charAt(0);

        chekapha cobj = new chekapha();
        bret = cobj.check(charater);

        if(bret == true)
        {
            System.out.println("That is small letter    " + charater);
        }
        else
        {
            System.out.println("That is not small letter   " +charater);
        }
    }
}