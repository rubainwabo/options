public class Print_bits extends Reverse_bits
{
	/*public static void main(String[] args)
	{
		int numarg = args.length;
		for (int c = 0; c < numarg; c++)
		{ 
			int n = Integer.parseInt(args[c]);
			System.out.print("Binary representation of " + n + " : ");
			print_bits(n);
			System.out.print(" & Bit reversed representation of " + n + " : ");
			print_bits(reverse_bits((char) n));
			System.out.println("");
		}
	}*/
	public static void print_bits(int n)
	{
		long i;
		
		i = 1L << 31;
		while (i > 0)
		{
			if ((n & i) > 0)
				System.out.print("1");
			else
				System.out.print("0");
			i >>= 1;
		}
	}
}