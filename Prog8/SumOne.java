/*Question: Given an array of 'N' elements .Return the sum of all array elements
Sample Input: A[]={1,2,3,4,5} ->15 A[]={2,2,2} -> 6
Sample Output: a[]={12,2,3} ->17
*/
public class SumOne
{
  long res = 0;
  public long arraySum(int[] a)
  {

	  for(int i = 0; i < a.length; i++)
	  {
        res = res + a[i];
      }
      return res;
    }


}