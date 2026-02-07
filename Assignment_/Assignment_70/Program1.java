/*
Write a recursive program which accept number from user and display below pattern.
Input : 5
Output : 5 * 4 * 3 * 2 * 1 *
*/
import java.util.*;

class Program1
{
    static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print(iNo + " * ");
            Display(iNo - 1);
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
