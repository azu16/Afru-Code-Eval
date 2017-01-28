/*Question: Given an array of ints, return true if the array does not have any 1's or 3's.
Sample Input: 1. lucky13({0, 2, 4}) -> true 2. lucky13({1, 2, 3}) -> false 3. lucky13({1, 2, 4}) -> false
Sample Output: 1. lucky13({0, 2, 4}) -> true
*/
public class NoOneThree
{
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] == 1 || a1[i] == 3)
		  {
			  return b1;
		  }
	  }
	  b1 = true;
	  return b1;
  }
}