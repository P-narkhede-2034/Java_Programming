/*
Write a program which accept two numbers from user and display position of common ON bits
from that two numbers.
*/
import java.util.*;

class Program2
{
    public static void CommonBits(int iNo1, int iNo2)
    {
        int iMask = iNo1 & iNo2;
        int iPos = 1;

        while(iMask != 0)
        {
            if((iMask & 1) == 1)
            {
                System.out.print(iPos + " ");
            }
            iMask = iMask >> 1;
            iPos++;
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number 1: ");
        int iValue1 = sobj.nextInt();
         System.out.println("Enter the number 2 : ");
        int iValue2 = sobj.nextInt();

        CommonBits(iValue1, iValue2);
    }
}
