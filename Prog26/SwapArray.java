/*Question: Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
Sample Input: 1. swapEnds({1, 2, 3, 4}) -> {4, 2, 3, 1} 2. swapEnds({1, 2, 3}) -> {3, 2, 1}
Sample Output: 3. swapEnds({8, 6, 7, 9, 5}) -> {5, 6, 7, 9, 8}
*/
public class SwapArray
{
  public int[] mod(int[] a2)
  {
	  int[] a3 = a2;;
	  int temp = a2[0];
	  a2[0] = a2[a2.length - 1];
	  a2[a2.length - 1] = temp;
	  return a3;
  }
}