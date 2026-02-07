/*
Write a program which accept one number from user and check whether 9th or 12th bit is on or off.
*/
import java.util.*;

class Program3
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = (1 << 8) | (1 << 11);
        return (iNo & iMask) != 0;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        boolean bRet = ChkBit(iValue);
        System.out.println(bRet);
    }
}
