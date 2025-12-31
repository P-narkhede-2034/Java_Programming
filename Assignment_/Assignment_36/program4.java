/*
4. Write a program which accept string from user and display only
digits from that string.
*/

import java.util.Scanner;

class Display
{
    public void Displaydigit(String str)
    {
        int i = 0;

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9')
            {
                System.out.print(ch);
            }
        }
    }
}

class program4
{
    public static void main(String[] args)
    {
        String sValue;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        sValue = sobj.nextLine();

        Display dobj = new Display();
        dobj.Displaydigit(sValue);
    }
}
