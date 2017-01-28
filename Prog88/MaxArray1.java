/*Question: Passing 2 arrays of ints to a method. The method should return the max value present across both the array elements.
Sample Input: A[] =22,55,34,67,88 B[] = 32,77,666,11
Sample Output: 666

*/
public class MaxArray1
{
  int temp;
  int temp1;
  public int num(int[] a2,int[] a3)
  {
	for(int i = 0; i < a2.length; i++)
	{
		if(a2[i] > temp)
		{
			temp = a2[i];
		}
	}
	for(int j = 0; j < a3.length; j++)
	{
		if(a3[j] > temp)
		{
			temp1 = a3[j];
		}
	}
	if(temp > temp1)
	{
		return temp;
	}
	return temp1;
  }
}