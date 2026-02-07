/*
Write a recursive program which accept string from user and count number of characters.
Input : Hello
Output : 5
*/
import java.util.*;

class Program3
{
    static int Strlen(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        return 1 + Strlen(str.substring(1));
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the string : ");
        String str = sobj.next();

        int iRet = Strlen(str);
        System.out.println(iRet);
    }
}
