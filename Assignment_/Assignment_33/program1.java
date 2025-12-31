/*
1. Accept Character from user and check whether it is alphabet or not
(A-z a-z).
*/

import java.util.Scanner;

class chekapha
{
    public boolean check(char ch)
     {
        if(ch >= 'a' && ch <= 'z')
        {
            return true;
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
}

class program1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        char charater = 0;
        boolean bret = false;

        System.out.println("Enter the charater check where that alphabet are not");
        charater = sobj.next().charAt(0);

        chekapha cobj = new chekapha();
        bret = cobj.check(charater);

        if(bret == true)
        {
            System.out.println("that is alphabet    " + charater);
        }
        else
        {
            System.out.println("that is not aphabet   " +charater);
        }
    }
}