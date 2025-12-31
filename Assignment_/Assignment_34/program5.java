/*
5. Accept character from user and display its ASCII value in decimal,
octal and hexadecimal format.
*/

import java.util.Scanner;


class Convert
{
    public void Display(char ch)
    {
      
        int intValue = (int) ch;
        System.out.println( "Decimal " + intValue );

        String octalValue = Integer.toOctalString(intValue);
        System.out.println("octal " + octalValue);

        String hexaValue = Integer.toHexString(intValue);
        System.out.println("heaxadecimal " + hexaValue);
       
    }
}
class program5
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