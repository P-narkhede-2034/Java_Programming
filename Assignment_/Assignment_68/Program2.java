/*
Write a recursive program which display below pattern.
Output : 1 2 3 4 5
*/
class Program2
{
    static int i = 1;

    static void Display()
    {
        if(i <= 5)
        {
            System.out.print(i + " ");
            i++;
            Display();
        }
    }

    public static void main(String args[])
    {
        Display();
    }
}
