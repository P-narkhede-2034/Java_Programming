/*
Write a program in Java which copies a file using normal streams and buffered streams and displays the time
required for both.
*/
import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source file name:");
        String fname = sobj.nextLine();

        int i = 0;
        long start, end;

        FileInputStream fin1 = new FileInputStream(fname);
        FileOutputStream fout1 = new FileOutputStream("NormalCopy.txt");

        start = System.currentTimeMillis();
        while((i = fin1.read()) != -1)
        {
            fout1.write(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Normal Stream Time: " + (end - start));

        fin1.close();
        fout1.close();

        FileInputStream fin2 = new FileInputStream(fname);
        BufferedInputStream bin = new BufferedInputStream(fin2);
        FileOutputStream fout2 = new FileOutputStream("BufferedCopy.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout2);

        start = System.currentTimeMillis();
        while((i = bin.read()) != -1)
        {
            bout.write(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Buffered Stream Time: " + (end - start));

        bin.close();
        bout.close();
    }
}
