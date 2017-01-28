/*Question: Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You can return a new array.please preserve the order of other elements as it is.
Sample Input: 1. zeroFront({1, 0, 0, 1})-> {0, 0, 1, 1} 2. zeroFront({0, 1, 2, 0, 1}) -> {0, 0, 1,2, 1}
Sample Output: 3. zeroFront({1, 0}) -> {0, 1}
*/
public class ZeroFirst
{
  public int[] list(int[] a2)
  {
	  int k = 0;
	  int[] a3 = new int[a2.length];
	  for(int j = 0; j < a2.length; j++)
	  {
		  if(a2[j] == 0)
		  {
			  a3[k] = a2[j];
			   k++;
		  }
	  }
	  for(int m = 0; m < a2.length; m++)
	  {
		  if(a2[m] != 0)
		  {
			  a3[k] = a2[m];
			  k++;
		  }
	  }
	  return a3;
  }
}
