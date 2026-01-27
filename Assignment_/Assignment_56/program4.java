///////////////////////////////////////////////////////////////////////////////////////////
//4. Write java program to accept file name from user and create new file of
//that name if it is not existing.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class program4
{
    public static void main(String[] args) 
    {
        String filename ;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name :");
        filename = sobj.nextLine();

        try
        {
          File file = new File(filename);

          if(file.createNewFile())
          {
            System.out.println("File gets created...");
          }
          else
          {
            System.out.println("FIle alresy exits");
          }
        }
        catch(IOException eobj)
        {
            eobj.printStackTrace();
        }
    }
}