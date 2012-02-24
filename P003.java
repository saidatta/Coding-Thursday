/**
A short and readable solution to Projecteuler #3 

www.projecteuler.net/problem=3

################################
$ time java P003
6857

real    0m0.156s
user    0m0.031s
sys     0m0.015s
*/

public class P003
{
	public static void main (String args [])
	{
		long lim = 600851475143L;
		int divisor = 2;
		while (lim > divisor)
			if (lim % divisor == 0)
				lim = lim/divisor;
			else
				divisor++;
		System.out.println(divisor);
	}
}