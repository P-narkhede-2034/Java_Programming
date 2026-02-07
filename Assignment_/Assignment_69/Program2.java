/*
Write a recursive program which display below pattern.
Input : 5
Output : 1 2 3 4 5
*/
import java.util.*;

class Program2
{
    static void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            System.out.print(iNo + " ");
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
