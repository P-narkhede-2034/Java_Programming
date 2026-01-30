//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts a directory name and file extension from user and display only files
// having that extension.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name");
        String dir = sobj.nextLine();

        System.out.println("Enter extension");
        String ext = sobj.nextLine();

        File fobj = new File(dir);

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(File iobj : arr)
            {
                if(iobj.isFile() && iobj.getName().endsWith(ext))
                {
                    System.out.println(iobj.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }
        sobj.close();
    }
}
