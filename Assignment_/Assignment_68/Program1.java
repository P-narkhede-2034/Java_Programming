/*
Write a recursive program which display below pattern.
Output : * * * * *
*/
class Program1
{
    static int i = 1;

    static void Display()
    {
        if(i <= 5)
        {
            System.out.print("* ");
            i++;
            Display();
        }
    }

    public static void main(String args[])
    {
        Display();
    }
}
