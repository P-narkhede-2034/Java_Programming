/*
2.Write a program which accept string from user and accept one
character. Return frequency of that character..
*/

import java.util.Scanner;

class Display
{
    public void Countchar(String str , char letter)
    {
        int i = 0;

        int icount = 0;

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==  letter)
            {
                icount ++;
            }
        }

        System.out.println(icount);
    }
}

class program2
{
    public static void main(String[] args)
    {
        String sValue;
        char ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        sValue = sobj.nextLine();

        System.out.println("Enter the charater");
        ch = sobj.next().charAt(0);

        Display dobj = new Display();
        dobj.Countchar(sValue , ch);
    }
}
