//1. Write a program to check whether a number is prime or not.

class Logic
{
    void checkPrime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
