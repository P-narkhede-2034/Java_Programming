///////////////////////////////////////////////////////////////////////////////////////////
// open the file
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        String filename ; 
        
        System.out.println("Enter the file name that you want to open");
        filename = sobj.nextLine();

        try
        {
            FileInputStream fls = new FileInputStream(filename);
            System.out.println("file sucssfully open..");
            fls.close();
        }
        catch(IOException eobj)
        {
            eobj.printStackTrace();
        }
        sobj.close();
        
    }
}