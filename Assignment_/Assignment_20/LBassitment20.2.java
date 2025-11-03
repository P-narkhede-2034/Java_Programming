//2. Write a program to print numbers from N down to 1 in reverse order.

class Logic
{
    void printReverse(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
