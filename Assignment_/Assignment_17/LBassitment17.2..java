// 2. Write a program to check whether a number is a palindrome or not.

class Logic
{
    void checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
