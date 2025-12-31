/*
5. Accept division of student from user and depends on the division
display exam timing. There are 4 divisions in school as A,B,C,D. Exam
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
(Application should be case insensitive)
 */
import java.util.Scanner;

class chekapha
{
    public void Checkschedule(char ch)
     {
        char div = ch;

        switch (ch) 
        {
            case 'A':
                System.out.println("Your exam at 7 AM");
                break;

            case 'B':
                System.out.println("Your exam at 8.30 AM");
                break;

            case 'C':
                System.out.println("Your exam at 9.20 AM");
                break;

            case 'D':
                System.out.println("Your exam at 10.30 AM");
                break;

            default:
                System.out.println("Invalid division");
        }
     }
}     

class program5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        char charater = 0;
        boolean bret = false;

        System.out.println("Enter the charater check captial or not");
        charater = sobj.next().charAt(0);

        chekapha cobj = new chekapha();
        cobj.Checkschedule(charater);

       
    }
}