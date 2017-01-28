/*Question: Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
Sample Input: 1. has12({1, 3, 2})->true , 2. has12({3, 1, 2})->true ,
Sample Output: 3. has12({3, 1, 4, 5, 2}) -> true
*/
public class OneWithTwo
{
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] == 1)
		  {
			  for(int j = i+1; j < a1.length; j++)
			  {
				  if(a1[j] == 2)
				  {
					  b1 = true;
					  break;
				  }
			  }
			  break;
		  }
	  }
	   return b1;
  }
}