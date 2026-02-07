/*
Write a recursive program which display below pattern.
Output : A B C D E F
*/
class Program4
{
    static char ch = 'A';

    static void Display()
    {
        if(ch <= 'F')
        {
            System.out.print(ch + " ");
            ch++;
            Display();
        }
    }

    public static void main(String args[])
    {
        Display();
    }
}
