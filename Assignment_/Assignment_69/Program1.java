/*
Write a recursive program which display below pattern.
Input : 5
Output : * * * * *
*/
import java.util.*;

class Program1
{
    static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print("* ");
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
