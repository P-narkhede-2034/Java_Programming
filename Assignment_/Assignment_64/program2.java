//2. Write a program which checks whether 5th & 18th bit is On or OFF.

import java.util.Scanner;

class program2
{
    public static void main(String[] args) 
    {
        int ino = 0;
        int imask = 0;
        int Result = 0;
        int imask2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no");
        ino = sobj.nextInt();

        imask = 0x00000010;

        imask2 = 0x00020000;
        Result = ino & imask;

        if(Result == imask)
        {
            System.out.println("5 th bit is on");
        }
        else
        {
            System.out.println("5 bit is off");
        }

         Result = ino & imask2;

        if(Result == imask2)
        {
            System.out.println("18 th bit is on");
        }
        else
        {
            System.out.println("18 th bit is off");
        }
        
        sobj.close();
    }
}