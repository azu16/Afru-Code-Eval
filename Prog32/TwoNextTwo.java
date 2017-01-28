/*Question: Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
Sample Input: 1. either24({1, 2, 2})->true 2. either24({4, 4, 1}) -> true
Sample Output: 3. either24({4, 4, 1, 2, 2}) -> false
*/
public class TwoNextTwo
{
	int count;
	int count1;
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length - 1; i++)
	  {
		  if(a1[i] == 2)
		  {
			  if(a1[i+1] == 2)
			  {
				  count++;
			  }
		  }
		  if(a1[i] == 4)
		  {
			  if(a1[i+1] == 4)
			  {
			  	  count1++;
			  }
		  }
	  }
	   if(count > 0 && count1 == 0)
	     b1 = true;
	   if(count1 > 0 && count == 0)
	     b1 = true;
	     return b1;

  }
}