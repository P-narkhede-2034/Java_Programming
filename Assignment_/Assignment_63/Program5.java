/*
Write a program in Java which reads first 1 KB data from Combined.bin and writes it into a new output
file.
*/
import java.io.*;

class Program5
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fin = new FileInputStream("Combined.bin");
        FileOutputStream fout = new FileOutputStream("Output.bin");

        byte b[] = new byte[1024];
        fin.read(b);
        fout.write(b);

        fin.close();
        fout.close();
    }
}
