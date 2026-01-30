//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name and integer N from user and copy first N bytes into a
// new file.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        System.out.println("Enter number of bytes");
        int N = sobj.nextInt();

        FileInputStream fiobj = new FileInputStream(FileName);
        FileOutputStream foobj = new FileOutputStream("FirstNBytes.txt");

        int iRet = 0;
        int count = 0;

        while((iRet = fiobj.read()) != -1 && count < N)
        {
            foobj.write(iRet);
            count++;
        }

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}
