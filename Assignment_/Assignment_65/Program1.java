/*
Write a program which accept one number from user and off 7th bit of that number if it is on.
Return modified number.
*/
import java.util.*;

class Program1
{
    public static int OffBit(int iNo)
    {
        int iMask = ~(1 << 6);
        return iNo & iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = OffBit(iValue);
        System.out.println(iRet);
    }
}
