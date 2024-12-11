public class Demo
{
    public static void main(String args[])
	{
	int num, sum, dummy;
	sum=0;
		System.out.println("The arguements passed on command line are ..");
		for (num=0; num<args.length; num++) 
    		{
        		System.out.println("The [" + num + "] element =" + args[num]);
			dummy = Integer.parseInt(args[num]);
			sum = sum + dummy;
			}
				System.out.println("Total of numbers = "+ sum);
    			}
}