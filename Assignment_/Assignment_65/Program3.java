/*
Write a program which accept one number from user and toggle 7th bit of that number.
Return modified number.
*/
import java.util.*;

class Program3
{
    public static int ToggleBit(int iNo)
    {
        int iMask = (1 << 6);
        return iNo ^ iMask;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = ToggleBit(iValue);
        System.out.println(iRet);
    }
}
