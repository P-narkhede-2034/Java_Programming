/*
Write a recursive program which accept number from user and return largest digit.
Input : 87983
Output : 9
*/
import java.util.*;

class Program2
{
    static int Max(int iNo)
    {
        if(iNo < 10)
        {
            return iNo;
        }

        int digit = iNo % 10;
        int max = Max(iNo / 10);

        if(digit > max)
        {
            return digit;
        }
        return max;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = Max(iValue);
        System.out.println(iRet);
    }
}
