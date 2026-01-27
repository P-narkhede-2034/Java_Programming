///////////////////////////////////////////////////////////////////////////////////////////
//2. Write java program to accept file name from user and check whether
//that file is regular file or not..
///////////////////////////////////////////////////////////////////////////////////////////
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            Path file = Paths.get(filename);

            if(Files.isRegularFile(file))
            {
                System.out.println("File is regular type");
            }
            else
            {
                System.out.println("That file is not regular file");
            }
        }
        catch(SecurityException eobj)
        {
            eobj.printStackTrace();
        }
    }
}