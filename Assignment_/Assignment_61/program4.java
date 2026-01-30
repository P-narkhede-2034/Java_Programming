//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts two input file names and one output file name and merge both files
// into the output file.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first file name");
        String f1 = sobj.nextLine();

        System.out.println("Enter second file name");
        String f2 = sobj.nextLine();

        System.out.println("Enter output file name");
        String fout = sobj.nextLine();

        FileInputStream fiobj1 = new FileInputStream(f1);
        FileInputStream fiobj2 = new FileInputStream(f2);
        FileOutputStream foobj = new FileOutputStream(fout);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        while((iRet = fiobj1.read(Buffer)) != -1)
        {
            foobj.write(Buffer, 0, iRet);
        }

        while((iRet = fiobj2.read(Buffer)) != -1)
        {
            foobj.write(Buffer, 0, iRet);
        }

        fiobj1.close();
        fiobj2.close();
        foobj.close();
        sobj.close();
    }
}
