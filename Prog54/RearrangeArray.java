/*Question: Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.You can make a new array and return it.Note:Retain the order of other elements.
Sample Input: 1. evenOdd({1, 0, 1, 0, 0, 1, 1}) -> {0, 0, 0, 1, 1, 1, 1} 2. evenOdd({3, 3, 2})->{2, 3, 3}
Sample Output: 3. evenOdd({2, 2, 2}) -> {2, 2, 2}
*/
public class RearrangeArray
{
  public int[] list(int[] a2)
  {
	  int k = 0;
	int[] a3 = new int[a2.length];
	for(int j = 0; j < a2.length; j++)
	{
		if(a2[j] % 2 == 0)
		{

				a3[k] = a2[j];
				k++;

		}
	}
	for(int m = 0; m < a2.length; m++)
	{
		if(a2[m] % 2 != 0)
		{

				a3[k] = a2[m];
		         k++;
		}
	}
	  return a3;
  }
}

















