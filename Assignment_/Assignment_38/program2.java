/*
2. Write a program which accept string from user and copy that
characters of that string into another string by removing all white
spaces.
*/

import java.util.Scanner;

class Display
{
    public void RemoveWhiteSpace(String str)
    {
        int i = 0;
        String newStr = "";

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch != ' ')
            {
                newStr = newStr + ch;
            }
        }

        System.out.println("String without white spaces : " + newStr);
    }
}

class program2
{
    public static void main(String[] args)
    {
        String sValue;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        sValue = sobj.nextLine();

        Display dobj = new Display();
        dobj.RemoveWhiteSpace(sValue);
    }
}
