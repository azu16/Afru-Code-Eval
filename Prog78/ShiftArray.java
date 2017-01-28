/*Question: Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You can return a new array.
Sample Input: 1. shiftLeft({6, 2, 5, 3}) -> {2, 5, 3, 6} 2. shiftLeft({1, 2}) -> {2, 1} 3. shiftLeft({1}) -> {1}
Sample Output: shiftLeft({1, 2}) -> {2, 1}
*/
public class ShiftArray
{
  public int[] list(int[] a2)
  {
	  int temp = 0;
	  for(int i = 0; i < a2.length-1; i++)
	  {
           temp = a2[i];
           a2[i] = a2[i+1];
           a2[i+1] = temp;
	  }
	  return a2;
  }
}