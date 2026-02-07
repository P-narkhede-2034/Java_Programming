import java.util.Scanner;

class program5
{
    public static void main(String[] args)
    {
        long ino = 0;
        long imask = 0;
        long result = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        ino = sobj.nextLong();

        imask = 0x00000001L | 0x80000000L;

        result = ino & imask;

        if(result == imask)
        {
            System.out.println("1st and 32nd bits are ON");
        }
        else
        {
            System.out.println("One or more bits are OFF");
        }

        sobj.close();
    }
}
