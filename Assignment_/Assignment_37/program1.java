/*
I.Write a program which accept string from user and accept one
character. Check whether that character is present in string or not.
*/

import java.util.Scanner;

class Display
{
    public void Checkchar(String str , char letter)
    {
        int i = 0;

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==  letter)
            {
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
    }
}

class program1
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
        dobj.Checkchar(sValue , ch);
    }
}
