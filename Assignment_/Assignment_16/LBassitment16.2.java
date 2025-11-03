// 2. Write a program to check whether a given number is even or odd.

class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
