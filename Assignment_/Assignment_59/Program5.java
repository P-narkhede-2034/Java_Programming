/*
Write a program in Java which accepts a directory name from user and display file name along with its
absolute path.
*/
import java.io.*;
import java.util.*;

class Program5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name:");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File arr[] = fobj.listFiles();

        if(arr != null)
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i].getName() + " : " + arr[i].getAbsolutePath());
            }
        }
    }
}
