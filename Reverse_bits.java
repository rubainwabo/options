public class Reverse_bits
{
	public static char reverse_bits(char octet)
	{
		int len = 8;
		char r = 0;
		
		while (len-- > 0)
		{
			r = (char) ((r << 1) | (octet & 1));
			octet >>= 1;
		}
		return (r);
	}
}