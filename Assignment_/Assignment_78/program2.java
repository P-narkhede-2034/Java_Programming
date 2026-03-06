
import java.util.*;

class program2 {
    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int n;

        System.out.println("Enter number of votes: ");
        n = sobj.nextInt();

        if(n < 0)
        {
            System.out.println("Invalid number");
            return;
        }

        int[] ids = new int[n];
        int valid = 0;
        int duplicate = 0;

        for(int i=0;i<n;i++)
        {
            ids[i] = sobj.nextInt();

            boolean found = false;

            for(int j=0;j<i;j++)
            {
                if(ids[i] == ids[j])
                {
                    found = true;
                    break;
                }
            }

            if(found)
            {
                duplicate++;
            }
            else
            {
                valid++;
            }
        }

        System.out.println("Valid Votes: " + valid);
        System.out.println("Rejected Duplicate Votes: " + duplicate);
    }
}
