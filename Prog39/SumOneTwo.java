/*Question: Given an array of 'n ' ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist.
Sample Input: 1. sum2([1, 2, 3]) -> 3 2. sum2([1, 1]) -> 2
Sample Output: 3. sum2([1, 1, 1, 1]) -> 2
*/
public class SumOneTwo
{
	int tot;
  public int sum(int[] a1)
  {
	   int count = 0;
	  for(int j = 0; j < a1.length; j++)
	  {
		  if(count < 2)
		  {
		   count++;
		   tot = tot + a1[j];
	      }
	  }
	  return tot;
  }
}