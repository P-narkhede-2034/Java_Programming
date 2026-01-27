///////////////////////////////////////////////////////////////////////////////////////////
//3. Write java program to accept directory name from user and create that
//di rectory.
///////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.Scanner;

class program3
{
    public static void main(String[] args)
{
        String filename ;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name :");
        filename = sobj.nextLine();

       File file = new File(filename);

       if(file.mkdir())
       {
        System.out.println("directory gets created");
       }
       else
       {
        System.out.println("error : directory not ctreat");
       }
       
       sobj.close();
       
    }
}