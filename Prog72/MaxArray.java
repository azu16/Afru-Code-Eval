/*Question: Given an array of 'N' ints as parameter.The method should return the max value from it.
Sample Input: 11,23,366,45,53
Sample Output: 366
*/
public class MaxArray
{
  int temp;
  public int num(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] > temp)
		  {
			  temp = a1[i];
		  }
	  }
	  return temp;
  }
}