/*
2. Accept Character from user and check whether it is capital or not
(A-Z).
 */
import java.util.Scanner;

class chekapha
{
    public boolean check(char ch)
     {
       
       if(ch >= 'A' && ch <= 'Z') 
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
}

class program2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        char charater = 0;
        boolean bret = false;

        System.out.println("Enter the charater check captial or not");
        charater = sobj.next().charAt(0);

        chekapha cobj = new chekapha();
        bret = cobj.check(charater);

        if(bret == true)
        {
            System.out.println("that is capital letter    " + charater);
        }
        else
        {
            System.out.println("that is not capital letter   " +charater);
        }
    }
}