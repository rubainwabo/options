//import java.util.Scanner;

public class Options extends Print_bits
{	
	public static void main(String[] args)
	{
		/*System.out.println("Hello in Java!");
		
		System.out.println("\nFirst argument read = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])) + " Second argument = " + args[1]);
		System.out.print("What is your name = ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		printName(name);
		*/
		 
		int		index, stock = 0;
		long	printer = 1L << 31; // max integer
		
		int		nbargs = args.length;
		for (int i = 0; i < nbargs; i++)
		{
			int len = args[i].length();
			if (args[i].charAt(0) == '-')
			{
				if (args[i].charAt(1) == 'h')
				{
					System.out.println("Usage : -abcdefghijklmnopqrstuvwxyz");
					System.exit(0);
				}
				index = 1;
				while (index < len && args[i].charAt(index) >= 'a' && args[i].charAt(index) <= 'z')
				{
					stock |= 1 << (25 - ('z' - args[i].charAt(index)));
					index++;
				}
				if (index < len && (args[i].charAt(index) < 'a' || args[i].charAt(index) > 'z'))
				{
					System.out.println("Invalid option");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Usage : -abcdefghijklmnopqrstuvwxyz");
				System.exit(0);
			}
		}
		print_bits(stock);
	}
	
	public static void	printName(String name)
	{
		System.out.println("Hello " + name);
	}
}