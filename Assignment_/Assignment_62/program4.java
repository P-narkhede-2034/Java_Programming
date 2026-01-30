//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name from user and create a backup copy of it with name
// original_backup.ext.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        String name = fobj.getName();
        int index = name.lastIndexOf(".");

        String backup = name.substring(0, index) + "_backup" + name.substring(index);

        FileInputStream fiobj = new FileInputStream(fobj);
        FileOutputStream foobj = new FileOutputStream(backup);

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
