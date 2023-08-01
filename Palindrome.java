import java.util.Scanner;
public class Palindrome
{
      //while loop
	public static void While_Loop()
	{

        int i=0;
        //do
        while(i<=30)
        {
        	if(i>9)
        	{
        		int a=i/10;
        		int b=i%10;
        		if(a==b)
        		{
        		    System.out.println(i+" Is Palindromic Number");
        		}
        		
            }
                i++;
        }
            //while(i<=30);         
    }
        
	public static void main(String[] args)
	{
	  System.out.println("Enter Choice To Check Palindromic Number:"+"\n1. Provide User Input"+"\n2. While Loop Range From 0-30");
	  Scanner op=new Scanner(System.in);
	  int ch=op.nextInt();
	  switch(ch)
	  {
	  case 1:
	  	System.out.println("Enter A 3-Digit Number:");
		int n = op.nextInt();
		int a = n/100;
        int y = n/10;
        int b = y%10;
        int c = n%10;
        if(a==c)
		        {
		        	System.out.println(n+" Is Palindromic Number");
		        }
		 else
		 {
		    System.out.println("Not A Palindromic Number");
		  }
	  	break;
	  case 2:
	  	While_Loop();
	  	break;
	  default:
	  	System.out.println("Enter A Valid Choice");
	  }
	}
}