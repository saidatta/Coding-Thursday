/**
This class is a single solution to problem1 in java.

@author Venkata
*/

public class P001
{
     static long sum = 0; //a global variable for sum.
    
      public static void main(String [] args)
      {
      	long time = System.currentTimeMillis(); // To check the runtime of your program

	System.out.println(compute(1000)); // printing the answer

	System.out.println("Time: "+ ((System.currentTimeMillis()-time)/1000.0));
      }

									
     public static long compute(int x)						     {
												if(x%3 == 0 || x%5 ==0) //3 and 5 multiples.
													sum += x;
																						if(x>0)																			 		return compute(x-1);// go to next number.															return sum;								}								     }
