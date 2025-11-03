//2. Write a program to count how many even and odd numbers are present between 1 and N.
class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
