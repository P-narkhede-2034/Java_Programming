/*
Write a recursive program which display below pattern.
Input : 6
Output : A B C D E F
*/
import java.util.*;

class Program4
{
    static void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            System.out.print((char)('A' + iNo - 1) + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}
