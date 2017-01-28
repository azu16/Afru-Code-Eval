/*Question: Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
Sample Input: 1. copyEvens({3, 2, 4, 5, 8}, 2) -> {2, 4} 2. copyEvens({3, 2, 4, 5, 8}, 3) -> {2, 4, 8}
Sample Output: 3. copyEvens({6, 1, 2, 4, 5, 8}, 3) -> {6, 2, 4}
*/
public class NewArray
{

  public int[] list(int[] a2, int n)
  {
	  int[] a3 = new int[n];
	  int count = 0;
	  int k = 0;
	  for(int j = 0; j < a2.length; j++)
	  {
		  if(count < n)
		  {
			  if(a2[j] % 2 == 0)
			  {
				 a3[k] = a2[j];
				 k++;
				 count++;
			  }
	      }
	  }
	  return a3;
  }
 }