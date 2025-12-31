/*
5. Write a program which accept string from user and count number of
white spaces
*/

import java.util.Scanner;

class Display
{
    public void Displaydigit(String str)
    {
        int i = 0;
        int count = 0;

        for(i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==  ' ')
            {
                count++;
            }
        }

        System.out.println(count);
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
        dobj.Displaydigit(sValue);
    }
}
