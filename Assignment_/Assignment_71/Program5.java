/*
Write a recursive program which accept number from user and return its reverse number.
Input : 523
Output : 325
*/
import java.util.*;

class Program5
{
    static int rev = 0;

    static int Reverse(int iNo)
    {
        if(iNo == 0)
        {
            return rev;
        }

        rev = (rev * 10) + (iNo % 10);
        return Reverse(iNo / 10);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = Reverse(iValue);
        System.out.println(iRet);
    }
}
