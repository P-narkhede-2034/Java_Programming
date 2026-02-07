/*
Write a program which accept one number and position from user and toggle that bit.
Return modified number.
*/
import java.util.*;

class Program4
{
    public static int ToggleBit(int iNo, int iPos)
    {
        int iMask = 1 << (iPos - 1);
        return iNo ^ iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
         System.out.println("Enter the pos : ");
        int iPos = sobj.nextInt();

        int iRet = ToggleBit(iValue, iPos);
        System.out.println(iRet);
    }
}
