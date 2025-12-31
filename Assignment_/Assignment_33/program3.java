/*
3. Accept Character from user and check whether it is digit or not
(0-9).
 */
import java.util.Scanner;

class chekapha
{
    public boolean check(int ino)
     {
       
       if(ino >= 0 && ino <= 9) 
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
}

class program3
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = 0;
        boolean bret = false;

        System.out.println("Enter the value");
        no = sobj.nextInt();

        chekapha cobj = new chekapha();
        bret = cobj.check(no);

        if(bret == true)
        {
            System.out.println("that is digit    " + no);
        }
        else
        {
            System.out.println("that is not digit   " +no);
        }
    }
}