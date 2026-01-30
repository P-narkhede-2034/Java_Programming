
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//3.Write a program in Java which accepts file name and one string from user and append that string at the
//end of file.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program3
{
    public static void main(String[] args) 
    {
        String FileName = null;
        String str = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter he existing file name");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        try
        {
            if((fobj.exists()))
            {
                System.out.println("Enter the string that you want append");
                str = sobj.nextLine();

                FileOutputStream foobj = new FileOutputStream(fobj,true);

                byte arr[] = str.getBytes();

                foobj.write(arr);

                System.out.println("data append succesfully...");
                foobj.close();
            }
            else
            {
                System.out.println("There is no such file");
            }
            sobj.close();
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}