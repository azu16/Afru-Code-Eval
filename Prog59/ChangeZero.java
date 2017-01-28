/*Question: Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.Otherwise returned the same array.
Sample Input: 1. fix23({1, 2, 3}) -> {1, 2, 0} 2. fix23({2, 3, 5}) -> {2, 0, 5}
Sample Output: 3. fix23({1, 2, 1}) -> {1, 2, 1}
*/
public class ChangeZero
{
  public int[] list(int[] a2)
  {
	  for(int j = 0; j < a2.length; j++)
	  {
		  if(a2[j] == 2)
		  {
			  if(j == a2.length - 1)
			  {
				  return a2;
			  }
			  if(a2[j+1] == 3)
			  {
				  a2[j+1] = 0;
				   break;

			  }
	      }
	  }
	  return a2;
  }
}
