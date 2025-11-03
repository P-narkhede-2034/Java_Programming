// S. Write a program to check whether a number is positive, negative, or zero.

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
            System.out.println(num + " is positive");
        else if(num < 0)
            System.out.println(num + " is negative");
        else
            System.out.println("Number is zero");
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
