/*
Write a recursive program which accept number from user and return its product of digits.
Input : 523
Output : 30
*/
import java.util.*;

class Program5
{
    static int Mult(int iNo)
    {
        if(iNo == 0)
        {
            return 1;
        }
        return (iNo % 10) * Mult(iNo / 10);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iRet = Mult(iValue);
        System.out.println(iRet);
    }
}
