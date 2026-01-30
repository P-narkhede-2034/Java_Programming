/*
Write a program in Java which accepts directory name and create a file Combined.bin that stores data of
all files sequentially.
*/
import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String dname = sobj.nextLine();

        File dir = new File(dname);
        FileOutputStream fout = new FileOutputStream("Combined.bin");

        File arr[] = dir.listFiles();

        if(arr != null)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i].isFile())
                {
                    FileInputStream fin = new FileInputStream(arr[i]);
                    int ch;
                    while((ch = fin.read()) != -1)
                    {
                        fout.write(ch);
                    }
                    fin.close();
                }
            }
        }

        fout.close();
    }
}
