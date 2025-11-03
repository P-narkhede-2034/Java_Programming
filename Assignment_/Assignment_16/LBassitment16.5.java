
// S. Write a program to count the number of digits in a given number.
class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
