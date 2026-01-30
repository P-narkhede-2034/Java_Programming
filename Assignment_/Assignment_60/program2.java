//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts a directory name from user and display the name of the largest file (by
// size).
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name");
        String dir = sobj.nextLine();

        File fobj = new File(dir);

        long max = 0;
        String name = "";

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(File iobj : arr)
            {
                if(iobj.isFile() && iobj.length() > max)
                {
                    max = iobj.length();
                    name = iobj.getName();
                }
            }
            System.out.println("Largest file is : " + name);
        }
        else
        {
            System.out.println("Invalid directory");
        }
        sobj.close();
    }
}
