/*
4.Write a program which accept string from user and accept one
character. Return index of last occurrence of that character.
*/

import java.util.Scanner;

class Display
{
    public void lastchar(String str , char letter)
    {
        int i = 0;

        int occrance = 0;
        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==  letter)
            {
                occrance = i;
            }
        }

        if(occrance != 0)
        {
            System.out.println(occrance);
        }
        else
        {
            System.out.println(letter + "  not present on string");
        }

    }
}

class program4
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
        dobj.lastchar(sValue , ch);
    }
}
