/*
5. Write a program which accept string from user and copy that
characters of that string into another string by toggling the case.
*/

import java.util.Scanner;

class Display
{
    public void ToggleCase(String str)
    {
        int i = 0;
        String newStr = "";

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

        
            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }
         
            else if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            newStr = newStr + ch;
        }

        System.out.println("Toggled string : " + newStr);
    }
}

class program5
{
    public static void main(String[] args)
    {
        String sValue;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        sValue = sobj.nextLine();

        Display dobj = new Display();
        dobj.ToggleCase(sValue);
    }
}
