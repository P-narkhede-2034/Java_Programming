/*
Write a program in Java which accepts source directory and destination directory and copy all files from source
directory into destination directory.
*/
import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source directory:");
        String src = sobj.nextLine();

        System.out.println("Enter destination directory:");
        String dest = sobj.nextLine();

        File srcDir = new File(src);
        File destDir = new File(dest);

        destDir.mkdir();

        File arr[] = srcDir.listFiles();

        if(arr != null)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i].isFile())
                {
                    FileInputStream fin = new FileInputStream(arr[i]);
                    FileOutputStream fout = new FileOutputStream(destDir.getPath() + "/" + arr[i].getName());

                    int ch;
                    while((ch = fin.read()) != -1)
                    {
                        fout.write(ch);
                    }

                    fin.close();
                    fout.close();
                }
            }
        }
    }
}
