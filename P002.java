/**
	
	This a possible java solution to Projecct Euler #2
	www.projecteuler.net/problems=2
	
	#################################
	$ time java P002
	4613732

	real    0m0.146s
	user    0m0.015s
	sys     0m0.031s

*/

public class P002
{
 public static void main(String [] args)
 {
	//time1
	long t = System.currentTimeMillis();
	//initiating the inital terms.
 	 int x = 0;
	 int y =1 ;
	 int sum1 = x;
	 int sum2 = 0;
	 while (sum1 < 4000000 ){ // loop for the answer (even-valued termms).
		 sum1 = x+y;
		 x = y;
		 y = sum1;

		 if (sum1 % 2 ==0){
			 sum2 += sum1;
		 }
		 
	 }
		System.out.println(sum2);  // print the answer.
		System.out.println(("Time "+(System.currentTimeMillis() - t)/1000.0));
	 }

 
 }
