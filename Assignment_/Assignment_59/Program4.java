/*
Write a program in Java which accepts a directory name from user and display count of total files and total
folders.
*/
import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name:");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File arr[] = fobj.listFiles();

        int fcount = 0;
        int dcount = 0;

        if(arr != null)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i].isFile())
                {
                    fcount++;
                }
                else if(arr[i].isDirectory())
                {
                    dcount++;
                }
            }
        }

        System.out.println("Total Files : " + fcount);
        System.out.println("Total Directories : " + dcount);
    }
}
