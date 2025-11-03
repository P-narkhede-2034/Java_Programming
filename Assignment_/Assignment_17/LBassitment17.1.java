// 1. Write a program to find the sum of digits of a number.
class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
