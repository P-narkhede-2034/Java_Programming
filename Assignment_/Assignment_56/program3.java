///////////////////////////////////////////////////////////////////////////////////////////
//4. Write java program to accept file name from user and create new file of
//that name if it is not existing.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class program3
{
    public static void main(String[] args) 
    {
        String filename ;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name :");
        filename = sobj.nextLine();

        try
        {
            FileWriter fw = new FileWriter(filename,true);
            fw.write("that is write programatically...");
            System.out.println("data get sucessfully written");
            fw.close();
        }
        catch(IOException eobj)
        {
            eobj.printStackTrace();
        }
    }
}