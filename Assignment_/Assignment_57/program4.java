///////////////////////////////////////////////////////////////////////////////////////////
//4. Write java program to accept file name from user calculate checksum of
//that file and display on screen.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;

class FileChecksum
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String filename = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(filename);

            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] buffer = new byte[1024];
            int bytesRead = 0;

            while((bytesRead = fin.read(buffer)) != -1)
            {
                md.update(buffer, 0, bytesRead);
            }

            fin.close();

            byte[] checksumBytes = md.digest();

            // Convert byte array to hexadecimal string
            StringBuilder checksum = new StringBuilder();
            for(byte b : checksumBytes)
            {
                checksum.append(String.format("%02x", b));
            }

            System.out.println("Checksum (MD5) : " + checksum.toString());
        }
        catch(Exception e)
        {
            System.out.println("Error : Unable to calculate checksum");
            e.printStackTrace();
        }

        sobj.close();
    }
}