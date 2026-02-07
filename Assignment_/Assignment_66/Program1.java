/*
Write a program which accept one number and position from user and check whether bit at that position
is on or off. If bit is one return TRUE otherwise return FALSE.
*/
import java.util.*;

class Program1
{
    public static boolean ChkBit(int iNo, int iPos)
    {
        int iMask = 1 << (iPos - 1);
        return (iNo & iMask) == iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
         System.out.println("Enter the pos : ");
        int iPos = sobj.nextInt();

        boolean bRet = ChkBit(iValue, iPos);
        System.out.println(bRet);
    }
}
