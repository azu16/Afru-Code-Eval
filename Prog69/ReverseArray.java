/*Question: Given an array of 'n' ints .Arrange the array elements in reverse order.
Sample Input: A={1,2,3,7,4}
Sample Output: {4,7,3,2,1}
*/
public class ReverseArray
{
  public int[] list(int[] a2)
  {
	int k = 0;
   int[] a3 = new int[a2.length];
   for(int j = a2.length - 1; j >= 0; j--)
   {
	   a3[k] = a2[j];
       k++;
   }
    return a3;
  }
}