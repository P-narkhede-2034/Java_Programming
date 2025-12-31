class program1
{
    public static void main(String args[])
    {
        int i;

        System.out.println("--------------------------------------------------");
        System.out.println("Symbol\tDecimal\tHexadecimal\tOctal");
        System.out.println("--------------------------------------------------");

        for(i = 0; i <= 255; i++)
        {
            System.out.println((char)i + "\t" + i + "\t" +
                               Integer.toHexString(i).toUpperCase() + "\t\t" +
                               Integer.toOctalString(i));
        }
    }
}
