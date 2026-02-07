/*
Write a recursive program which accept number from user and return summation of its digits.
Input : 879
Output : 24
*/
import java.util.*;

class Program2
{
    static int Sum(int iNo)
    {
        if(iNo == 0)
        {
            return 0;
        }
        return (iNo % 10) + Sum(iNo / 10);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = Sum(iValue);
        System.out.println(iRet);
    }
}
