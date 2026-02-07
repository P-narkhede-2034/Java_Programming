/*
Write a program which accept one number from user and toggle contents of first and last nibble
of the number. Return modified number.
*/
import java.util.*;

class Program5
{
    public static int ToggleNibble(int iNo)
    {
        int iMask = 0xF000000F;
        return iNo ^ iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = ToggleNibble(iValue);
        System.out.println(iRet);
    }
}
