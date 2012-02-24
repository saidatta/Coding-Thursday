'''
	MoreLines: This answer is a bit towards the inefficient algorithm
	             O(n^2)
'''

import time # import module to print RUNTIME.

start = time.time() # a variable to initially store the time.

print "ONE LINE SOLUTION:"
print len(set(i**j for i in range(2,101) for j in range(2,101)))

print "MORE LINES:"
s = set() # a set is a dataStructure kinda similar to sets in java. 

def f(): # this how you define functions in python.
	for i in range(2,101): # initial for loop.
			for j in range(2,101): # inside loop
						s.add(i**j) #adding the values.
							   #i**j = i power j 
f() #calling the function.
print len(s) #print the answer
print "Solved in",((time.time()-start)) #solved answer.

