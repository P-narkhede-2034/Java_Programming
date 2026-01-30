//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name and integer N from user and copy last N bytes into a new
// file.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        System.out.println("Enter number of bytes");
        int N = sobj.nextInt();

        File fobj = new File(FileName);
        long size = fobj.length();

        FileInputStream fiobj = new FileInputStream(fobj);
        FileOutputStream foobj = new FileOutputStream("LastNBytes.txt");

        fiobj.skip(size - N);

        int iRet = 0;

        while((iRet = fiobj.read()) != -1)
        {
            foobj.write(iRet);
        }

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}
