///////////////////////////////////////////////////////////////////////////////////////////
//I.Write java program to accept file name from user and open that file.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class program2
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
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);     
            }

        }
        catch(IOException eobj)
        {
            eobj.printStackTrace();
        }
    }
}