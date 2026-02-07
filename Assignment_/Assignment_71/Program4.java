/*
Write a recursive program which accept number from user and return smallest digit.
Input : 87983
Output : 3
*/
import java.util.*;

class Program4
{
    static int Min(int iNo)
    {
        if(iNo < 10)
        {
            return iNo;
        }

        int digit = iNo % 10;
        int min = Min(iNo / 10);

        if(digit < min)
        {
            return digit;
        }
        return min;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = Min(iValue);
        System.out.println(iRet);
    }
}
