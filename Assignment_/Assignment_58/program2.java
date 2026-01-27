
/////////////////////////////////////////////////////////////////////////////////
//2.Write java program to accept directory name from user and write names
//of all files from that directory into one newly created file named as
//"Marvellous.txt".
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.nio.*;
import java.util.*
;
class program2
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
            File fille = new File("Marvellous.txt");
            if(fille.createNewFile())
            {
                System.out.println("file gets created");
            }
            
            FileWriter fw = new FileWriter(fille);

            if(directory.exists())
            {
                File[] files = directory.listFiles();
                int i = 0;

                if(files != null)
                {
                    for(i = 0 ; i < files.length ; i++)
                    {
                        File file = files[i];

                        fw.write(file.getName());
                        fw.write(System.lineSeparator()); 
                    }
                }
            }

            sobj.close();
            fw.close();
            System.out.println("data wriiten sucessfully....");
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}