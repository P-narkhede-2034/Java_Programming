/*
Write a recursive program which accept number from user and return its factorial.
Input : 5
Output : 120
*/
import java.util.*;

class Program4
{
    static int Fact(int iNo)
    {
        if(iNo == 0)
        {
            return 1;
        }
        return iNo * Fact(iNo - 1);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the string : ");
        int iValue = sobj.nextInt();

        int iRet = Fact(iValue);
        System.out.println(iRet);
    }
}
