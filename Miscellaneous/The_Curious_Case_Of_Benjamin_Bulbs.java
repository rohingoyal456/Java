//You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. 
//In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation 
//every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.

import java.util.Scanner;
import java.lang.*;
public class The_Curious_Case_Of_Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of bulbs:");
        int n=input.nextInt();
        System.out.println("The bulb which will remain on:");
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            System.out.println(i*i);
        }
    }
}
