/*
Write a program in Java which accepts source and destination file names and copy file using
BufferedInputStream and BufferedOutputStream.
*/
import java.io.*;
import java.util.*;

class Program1
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String src = sobj.nextLine();

        System.out.println("Enter destination file name:");
        String dest = sobj.nextLine();

        FileInputStream fin = new FileInputStream(src);
        BufferedInputStream bin = new BufferedInputStream(fin);

        FileOutputStream fout = new FileOutputStream(dest);
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        int i = 0;
        while((i = bin.read()) != -1)
        {
            bout.write(i);
        }

        bin.close();
        bout.close();
    }
}
