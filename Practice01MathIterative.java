public class Practice01MathIterative implements Practice01Math
{
	public int fact(int n) throws Exception
	{
		int fac=1;
		if (n<0)
			throw new Exception();
		for (int i=1;i<=n;i++)
			fac*=i;
		return fac;
	}
	public int fib(int n) throws Exception
	{
		if (n<0)
			throw new Exception();
		if (n==1||n==0)
			return n;
		int fib=0;
		int fib1=1;
		int fib2=0;
		for(int i=1;i<n;i++)
		{
			fib=fib1+fib2;
			if (i>=1&&i<n)
			{
				fib2=fib1;
				fib1=fib;
			}
		}
		return fib;
	}
}
