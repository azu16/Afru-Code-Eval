/*Question: Given an array of ints, return true if the number of 1's is greater than the number of 4's
Sample Input: 1. more14({1, 4, 1}) -> true , 2. more14({1, 4, 1, 4}) -> false ,
Sample Output: 3. more14({1, 1}) -> true
*/
public class OneOrFour
{
	int count;
	int count1;
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] == 1)
		   count++;
		   if(a1[i] == 4)
		   count1++;
	  }
	  if(count > count1)
	    b1 = true;
	    return b1;
  }
}