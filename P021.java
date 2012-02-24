import java.util.*;
public class P021
{
	public static void main(String [] args)
		{
			ArrayList<Integer> n = new ArrayList<Integer>();
				int t = 0;
						for(int i = 1 ;i<10001;i++)
								{	int sum = 0;
											for(int x = 1;x<i;x++)
														{
																		if(i%x==0)
																							sum += i;
																										}
																													if(sum == 0)
																																	sum = 1;
																																				n.add(sum);
																																						}
																																								int a;
																																										for(int i = 0;i<n.size();i++)
																																												{
																																																a= n.get(i)-1;
																																																			if(a<10001)
																																																							if(n.get(a)==(i+1))
																																																											{
																																																															
																																																																			System.out.println(a);
																																																																								t += (i+1);
																																																																												}
																																																																															}
																																																																																	System.out.println(t);
																																																																																		}		
																																																																																			
																																																																																				public static void compute()
																																																																																					{
																																																																																							
																																																																																								}
																																																																																								}
