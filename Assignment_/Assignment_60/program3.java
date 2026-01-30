//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts a directory name from user and display the name of the smallest file (by
// size).
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name");
        String dir = sobj.nextLine();

        File fobj = new File(dir);

        long min = Long.MAX_VALUE;
        String name = "";

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(File iobj : arr)
            {
                if(iobj.isFile() && iobj.length() < min)
                {
                    min = iobj.length();
                    name = iobj.getName();
                }
            }
            System.out.println("Smallest file is : " + name);
        }
        else
        {
            System.out.println("Invalid directory");
        }
        sobj.close();
    }
}
