/*
Write a program which accept one number from user and range of positions from user.
Toggle all bits from that range.
*/
import java.util.*;

class Program5
{
    public static int ToggleBitRange(int iNo, int iStart, int iEnd)
    {
        int iMask = 0;

        for(int i = iStart; i <= iEnd; i++)
        {
            iMask = iMask | (1 << (i - 1));
        }

        return iNo ^ iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
         System.out.println("Enter the starting range : ");
        int iStart = sobj.nextInt();
         System.out.println("Enter the ending range : ");
        int iEnd = sobj.nextInt();

        int iRet = ToggleBitRange(iValue, iStart, iEnd);
        System.out.println(iRet);
    }
}
