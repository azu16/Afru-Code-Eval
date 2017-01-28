/*Question: Given an array of ints, return true if every element is a 1 or a 4.
Sample Input: 1. only14({1, 4, 1, 4}) -> true , 2. only14({1, 4, 2, 4}) -> false ,
Sample Output: 3. only14({1, 1}) -> true
*/
public class AllOneFour
{
	int count;
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] == 1 || a1[i] == 4)
		   count++;
	  }
	  if(count == a1.length)
	    b1 = true;
	    return b1;
  }
}