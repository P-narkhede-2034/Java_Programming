/////////////////////////////////////////////////////////////////////////////////
//I.Write java program to accept directory name from user and display all
//names of files from that directory which are regular file.
/////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        String dir;
        Scanner sobj = new Scanner(System.in); 
        
        System.out.println("Enter the directory name");
        dir = sobj.nextLine();

        File directory = new File(dir);

        try
        {
            if(directory.exists() && directory.isDirectory())
            {
                File[] files = directory.listFiles();

                System.out.println("List of regular files:");

                if(files != null)
                {
                    for(int i = 0; i < files.length; i++)
                    {
                        File file = files[i];

                        if(Files.isRegularFile(file.toPath()))
                        {
                            System.out.println(file.getName());
                        }
                    }
                }
            }
            else
            {
                System.out.println("Directory does not exist");
            }
        }
        catch(SecurityException eobj)
        {
            eobj.printStackTrace();
        }

        sobj.close();
    }
}