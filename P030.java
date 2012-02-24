/*
     
    @author Venkata

  ********************************
	$ time java P030
	443839

	real    0m1.092s
	user    0m0.031s
	sys     0m0.015s
*/

	public class P030
	{
		public static void main(String [] args)
			{
					long sum = 0;
							for(int i = 2;i<531441;i++)
										if(compute(i))
														sum+=i;

																/*
																		The maximum value for one digit is 9^5 = 59049. We can find 			out the maximum possible sum for a given number of digits by 			multiplying 59049 with the number of digits.
																				
																						Let's say we're gonna check the number 123456789. That's 9 			digits, so the maximum sum would be 9*59049 = 531441
																								*/
																										System.out.println(sum);		
																											}
																												
																													public static boolean compute(int x)
																														{
																																int y = x;
																																		double s =0;
																																				while(y>0)
																																						{
																																								 	s += Math.pow((y%10),5);
																																												y /= 10;
																																														}

																																																if(x == s)
																																																			return true;
																																																					else 
																																																								return false;
																																																									}
																																																									}
