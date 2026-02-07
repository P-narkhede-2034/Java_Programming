//I.Write a program which checks whether 15th bit is On or OFF.

import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        int ino = 0;
        int imask = 0;
        int Result = 0;

        Scanner sobj = new Scanner(System.in);

        ino = sobj.nextInt();

        imask = 0x00004000;
        Result = ino & imask;

        if(Result == imask)
        {
            System.out.println("15 th bit is on");
        }
        else
        {
            System.out.println("15 bit is off");
        }
        
        sobj.close();
    }
}