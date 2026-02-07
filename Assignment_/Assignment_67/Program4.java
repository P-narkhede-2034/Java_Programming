/*
Write a program which accept one number, two positions from user and check whether bit at first
or bit at second position is ON or OFF.
*/
import java.util.*;

class Program4
{
    public static boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 1 << (iPos1 - 1);
        int iMask2 = 1 << (iPos2 - 1);

        return ((iNo & iMask1) != 0) || ((iNo & iMask2) != 0);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
         System.out.println("Enter the pos 1 : ");
        int iPos1 = sobj.nextInt();
         System.out.println("Enter the pos 2 : ");
        int iPos2 = sobj.nextInt();

        boolean bRet = ChkBit(iValue, iPos1, iPos2);
        System.out.println(bRet);
    }
}
