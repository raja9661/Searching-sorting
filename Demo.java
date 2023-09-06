import java.util.Scanner;
public class Demo {
    public static void PowerofTwo(int n)
    {
        int pow=0;
        boolean check=false;
        for(int i=1;i<n/2;i++)
        {
                pow= 2*i;
            if(pow==n)
            {
                check=true;


            } 
        }
        if(check==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scn.nextInt();
        PowerofTwo(num);
    }
    
}
