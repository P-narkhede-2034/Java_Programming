/////////////////////////////////////////////////////////////////////////////////
//3. Write java program to accept directory name from user and write data
//of all files into one newly created file named as "Marvellous.txt".
/////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name");
        String dir = sobj.nextLine();

        File directory = new File(dir);

        try
        {
            File fille = new File("Marvellous.txt");
            if(fille.createNewFile())
            {
                System.out.println("file gets created");
            }

            FileWriter fw = new FileWriter(fille, true); 

            if(directory.exists() && directory.isDirectory())
            {
                File[] files = directory.listFiles();

                if(files != null)
                {
                    for(int i = 0; i < files.length; i++)
                    {
                        File file = files[i];

                        if(file.isFile())   
                        {
                            Scanner reader = new Scanner(file); 

                            while(reader.hasNextLine())
                            {
                                String data = reader.nextLine();
                                fw.write(data);
                                fw.write(System.lineSeparator());
                            }

                            reader.close();
                        }
                    }
                }
            }

            fw.close();
            sobj.close();

            System.out.println("Data written successfully...");
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}