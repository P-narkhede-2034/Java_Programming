//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts a path from user and display whether it exists or not. If it exists, display
// whether it is a file or directory.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter path");
        String path = sobj.nextLine();

        File fobj = new File(path);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is a file");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
        }
        else
        {
            System.out.println("Path does not exist");
        }
        sobj.close();
    }
}
