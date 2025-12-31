/*
I. Write a program which accept string from user and copy that
characters of that string into another string in reverse order.
*/

import java.util.Scanner;

class Display
{
     public void ReverseCopy(String str)
    {
        int i = 0;
        String Reverse = "";

        for(i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            Reverse = Reverse + ch;
        }

        System.out.println("Reversed string : " + Reverse);
    }
}

class program1
{
    public static void main(String[] args)
    {
        String sValue;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        sValue = sobj.nextLine();

        Display dobj = new Display();
        dobj.ReverseCopy(sValue );
    }
}
