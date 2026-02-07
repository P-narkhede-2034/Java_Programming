/*
Write a recursive program which accept string from user and count number of small characters.
Input : HElloWOrlD
Output : 5
*/
import java.util.*;

class Program3
{
    static int Small(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }

        char ch = str.charAt(0);
        if(ch >= 'a' && ch <= 'z')
        {
            return 1 + Small(str.substring(1));
        }
        return Small(str.substring(1));
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the string : ");
        String str = sobj.next();

        int iRet = Small(str);
        System.out.println(iRet);
    }
}
