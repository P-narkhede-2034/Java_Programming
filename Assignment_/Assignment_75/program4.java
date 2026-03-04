import java.util.Scanner;

class program4
{
    public static void main(String[] args) 
    {
       int helmet = 500;
       int license = 1000;
       int overspeeding = 1500;
       int Fine = 0;

       char healmetX = '\0' , licenseX = '\0' , overspeedX = '\0';
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Healmet worn (Y / N)");
        healmetX = sobj.next().charAt(0);

        System.out.println("License available (Y/N)");
        licenseX = sobj.next().charAt(0);

        System.out.println("Overspeeding (Y / N)");
        overspeedX = sobj.next().charAt(0);

        if((healmetX != 'Y' && healmetX !='N')  || (licenseX != 'Y' && licenseX != 'N') || (overspeedX !='Y' && overspeedX != 'N'))
        {
            System.out.println("Invalid Input");
            System.out.println("All and should be Y / N");
        }

        if((healmetX == 'Y') && (licenseX == 'Y') && (overspeedX == 'N'))
        {
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'N') && (licenseX == 'N') && (overspeedX == 'Y'))
        {
            Fine = helmet + license + overspeeding;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'N') && (licenseX == 'Y') && (overspeedX == 'N'))
        {
            Fine = Fine + helmet;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'N') && (licenseX == 'N') && (overspeedX == 'N'))
        {
            Fine = helmet + license;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'Y') && (licenseX == 'N') && (overspeedX == 'Y'))
        {
            Fine = license + overspeeding;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'Y') && (licenseX == 'Y') && (overspeedX == 'Y'))
        {
            Fine = overspeeding;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
        else if((healmetX == 'N') && (licenseX == 'Y') && (overspeedX == 'Y'))
        {
            Fine = helmet + overspeeding;
            System.out.println("Total Fine amount = " + Fine + "Rs" );
        }
      
        sobj.close();
    }
}
