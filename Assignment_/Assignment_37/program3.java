/*
3.Write a program which accept string from user and accept one
character. Return index of first occurrence of that character.
*/

import java.util.Scanner;

class Display
{
    public void firstchar(String str , char letter)
    {
        int i = 0;

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==  letter)
            {
                System.out.println(i);
                return;
            }
        }

        System.out.println(letter + "  not contain on string");

    }
}

class program3
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
        dobj.firstchar(sValue , ch);
    }
}
