///////////////////////////////////////////////////////////////////////////////////////////
//5. Write java program to accept directory name from user and display all
//names of files from that directory.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.util.Scanner;

class program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name :");
        String dirname = sobj.nextLine();

        File directory = new File(dirname);

        if(directory.exists() && directory.isDirectory())
        {
            File[] files = directory.listFiles();

            if(files != null)
            {
                System.out.println("Files in directory:");
               for(int i = 0; i < files.length; i++)
                {
                    File file = files[i];
                    System.out.println(file.getName());
                    
                    long size = dirname.length();
                    double sizeInKB = size / 1024.0;
                    System.out.printf("Size in KB : %.2f KB\n",sizeInKB);
                    
                }       
            }
        }
        else
        {
            System.out.println("Invalid directory path");
        }

        sobj.close();
    }
}