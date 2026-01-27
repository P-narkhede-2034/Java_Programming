/////////////////////////////////////////////////////////////////////////////////
//5. Write java program to accept directory name from user and write data
//of all files along with its name & size of each file into one newly created file
//named as "Marvellous.txt".
/////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name:");
        String dir = sobj.nextLine();

        File directory = new File(dir);

        try
        {
            File outfile = new File("Marvellous.txt");

            if(outfile.createNewFile())
            {
                System.out.println("Marvellous.txt created successfully");
            }

            FileWriter fw = new FileWriter(outfile, true); // append mode

            if(directory.exists() && directory.isDirectory())
            {
                File[] files = directory.listFiles();

                if(files != null)
                {
                    for(File file : files)
                    {
                        if(file.isFile())
                        {
                            fw.write("File Name : " + file.getName());
                            fw.write(System.lineSeparator());

                            long size = file.length();   // size in bytes
                            fw.write("File Size : " + size + " bytes");
                            fw.write(System.lineSeparator());

                            Scanner reader = new Scanner(file);

                            while(reader.hasNextLine())
                            {
                                fw.write(reader.nextLine());
                                fw.write(System.lineSeparator());
                            }

                            fw.write("--------------------------------------");
                            fw.write(System.lineSeparator());

                            reader.close();
                        }
                    }
                }
            }

            fw.close();
            sobj.close();

            System.out.println("Data written successfully into Marvellous.txt");
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}