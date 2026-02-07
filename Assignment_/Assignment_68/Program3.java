/*
Write a recursive program which display below pattern.
Output : 5 4 3 2 1
*/
class Program3
{
    static int i = 5;

    static void Display()
    {
        if(i >= 1)
        {
            System.out.print(i + " ");
            i--;
            Display();
        }
    }

    public static void main(String args[])
    {
        Display();
    }
}
