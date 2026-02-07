/*
Write a program which accept one number from user and count number of ON (1) bits in it
without using % and / operator.
*/
import java.util.*;

class Program1
{
    public static int CountOne(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCnt++;
            }
            iNo = iNo >> 1;
        }
        return iCnt;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = CountOne(iValue);
        System.out.println(iRet);
    }
}
