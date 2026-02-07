//3. Write a program which checks whether 7th & 15th & 21st , 28th bit //is On or OFF.
import java.util.Scanner;

class program3
{
    public static void main(String[] args)
    {
        int ino = 0;
        int imask = 0;
        int result = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        ino = sobj.nextInt();

        imask = 0x00000040 | 0x00004000 | 0x00100000 | 0x08000000;

        result = ino & imask;

        if(result == imask)
        {
            System.out.println("7th, 15th, 21st and 28th bits are ON");
        }
        else
        {
            System.out.println("One or more bits are OFF");
        }

        sobj.close();
    }
}
