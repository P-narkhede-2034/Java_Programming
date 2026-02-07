/*
Write a recursive program which display below pattern.
Output : a b c d e f
*/
class Program5
{
    static char ch = 'a';

    static void Display()
    {
        if(ch <= 'f')
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
