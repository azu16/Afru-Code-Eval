/*Question: Given an array of 'N' ints .The method which returns the min from the elements.
Sample Input: 123,66,77,333,555
Sample Output: 66
*/
public class MinArray
{
	int temp = -1 >>> 1;
  public int num(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] < temp)
		  {
			  temp = a1[i];
		  }
	  }
	  return temp;
  }
}