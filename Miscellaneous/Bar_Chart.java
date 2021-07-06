import java.util.Scanner;
public class Bar_Chart {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        barchart(a, n);
    }
    public static void barchart(int a[],int n)
    {
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(max-a[j]<=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
