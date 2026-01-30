//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name from user and display total number of bytes read from
// that file.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        FileInputStream fiobj = new FileInputStream(fobj);

        int iRet = 0;
        long count = 0;

        while((iRet = fiobj.read()) != -1)
        {
            count++;
        }

        System.out.println("Total bytes are : " + count);

        fiobj.close();
        sobj.close();
    }
}
