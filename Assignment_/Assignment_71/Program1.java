/*
Write a recursive program which accept string from user and count white spaces.
Input : HE llo WOr lD
Output : 3
*/
import java.util.*;

class Program1
{
    static int WhiteSpace(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        if(str.charAt(0) == ' ')
        {
            return 1 + WhiteSpace(str.substring(1));
        }
        return WhiteSpace(str.substring(1));
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int iRet = WhiteSpace(str);
        System.out.println(iRet);
    }
}
