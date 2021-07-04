import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n=input.nextInt();
        int counter=1;
        int m=1;
        for(int i=1;i<=n/2+1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(m+"\t");
                m++;
            }
            System.out.println();
            if(i==n/2+1)
            {
                break;
            }
            else
            {
                if(i==n/2 && n%2==0)
                {
                    continue;
                }
                else
                {
                    counter+=2*n;
                    m=counter;
                }
            }
        }
        counter-=n;
        m=counter;
        for(int i=n/2+2;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(m+"\t");
                m++;
            }
            counter-=2*n;
            m=counter;
            System.out.println();
        }
    }
}
