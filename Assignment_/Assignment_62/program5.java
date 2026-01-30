//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program in Java which accepts file name from user and handle all possible file related exceptions
// properly.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter file name");
            String FileName = sobj.nextLine();

            File fobj = new File(FileName);

            if(!fobj.exists())
            {
                System.out.println("File not found");
                return;
            }

            FileInputStream fiobj = new FileInputStream(fobj);

            int iRet = 0;

            while((iRet = fiobj.read()) != -1)
            {
            }

            System.out.println("File read successfully");

            fiobj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found exception");
        }
        catch(IOException e)
        {
            System.out.println("IO exception");
        }
        finally
        {
            sobj.close();
        }
    }
}
