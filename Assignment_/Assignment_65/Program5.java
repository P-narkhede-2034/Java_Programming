/*
Write a program which accept one number from user and on its first 4 bits.
Return modified number.
*/
import java.util.*;

class Program5
{
    public static int OnBit(int iNo)
    {
        int iMask = 0x0F;
        return iNo | iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = OnBit(iValue);
        System.out.println(iRet);
    }
}
