/*Question: Pass an int array and return a sorted array in ascending order.
Sample Input: arr={3,1,2,5,8,4,6,9,7}
Sample Output: Sorted ={1,2,3,4,5,6,7,8,9}
*/
public class Ascending
{
  public int[] list(int[] a2)
  {
	  int temp = 0;
	  int[] a3 = new int[a2.length];
	  for(int j = 0; j < a2.length; j++)
	  {
		  for(int k = j+1; k < a2.length; k++)
		  {
			  if(a2[j] > a2[k])
			  {
				  temp = a2[j];
				  a2[j] = a2[k];
				  a2[k] = temp;
			  }
		  }
	  }
	  return a2;
  }
}