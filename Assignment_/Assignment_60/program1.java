//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts a directory name from user and calculate total size of all files from that
// directory.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name");
        String dir = sobj.nextLine();

        File fobj = new File(dir);

        long size = 0;

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(File iobj : arr)
            {
                if(iobj.isFile())
                {
                    size = size + iobj.length();
                }
            }
            System.out.println("Total size is : " + size);
        }
        else
        {
            System.out.println("Invalid directory");
        }
        sobj.close();
    }
}
