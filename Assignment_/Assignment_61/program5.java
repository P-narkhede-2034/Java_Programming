//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name from user and split that file into two separate files (first
// half and second half).
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program5
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        long size = fobj.length();
        long half = size / 2;

        FileInputStream fiobj = new FileInputStream(fobj);
        FileOutputStream foobj1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream foobj2 = new FileOutputStream("SecondHalf.txt");

        int iRet = 0;
        long count = 0;

        while((iRet = fiobj.read()) != -1)
        {
            if(count < half)
            {
                foobj1.write(iRet);
            }
            else
            {
                foobj2.write(iRet);
            }
            count++;
        }

        fiobj.close();
        foobj1.close();
        foobj2.close();
        sobj.close();
    }
}
