
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//2.Write a program in Java which accepts source file name and destination file name from user and copy data
//using byte [ J buffer.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program1
{
    public static void main(String[] args) 
    {
        String FileName = null;
        String zip = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter he existing file name");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        try
        {
            if((fobj.exists()))
            {
                System.out.println("Enter the zip file name ");
                zip = sobj.nextLine();

                File zobj = new File(zip);

                zobj.createNewFile();

                FileInputStream fiobj = new FileInputStream(fobj);
                FileOutputStream foobj = new FileOutputStream(zobj);

                while (( iRet = fiobj.read(Buffer)) != -1) 
                {
                    foobj.write(Buffer,0,iRet);
                }
               
                System.out.println("write data succesfully....");

                fiobj.close();
                foobj.close();
            }
            else
            {
                System.out.println("There is no such file");
            }
            sobj.close();
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}