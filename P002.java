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
 	 int f1 = 0;
	 int f2 =1 ;
	 int sum = f1;
	 int total = 0;
	 while (sum < 4000000 ){ // loop for the answer (even-valued termms).
		 sum = f1+f2; // addinng the two terms.
		 f1 = f2; //swapping
		 f2 = sum; //getting the new element.

		 if (sum % 2 ==0){ // even-valued terms check.
			 total += sum; //adding the total.
		 }
		 
	 }
		System.out.println(total);  // print the answer.
		System.out.println(("Time "+(System.currentTimeMillis() - t)/1000.0));
	 }

 
 }
