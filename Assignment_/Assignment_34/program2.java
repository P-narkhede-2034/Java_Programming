/*
2. Accept character from user. If character is small display its
corresponding capital characterz and if it small then display its
corresponding capital. In other cases display as it is.
*/

import java.util.Scanner;


class Convert
{
    public void Display(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {

            System.out.printf("convert charater to %c\n", ch-32);
        }
        else if(ch >= 'A' && ch <= 'A')
        {
             System.out.printf("convert charater to %c\n", ch+32);
        }
        else 
        {
            System.out.printf("convert charater to %c\n", ch);
        }
    }
}
class program2
{
    public static void main(String[] args) 
    {
        char Cvalue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the charater");
        Cvalue = sobj.next().charAt(0);

        Convert cobj = new Convert();
        cobj.Display(Cvalue);

    }
}