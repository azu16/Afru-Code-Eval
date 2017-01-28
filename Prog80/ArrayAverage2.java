/*Question: Pass 2 arrays of ints to a method. The method should return the average of the values across the 2 arrays. The avg returned should be exact and not an approximation.
Sample Input: a[]={2,4,5,6} b[]={8,0,12,5}
Sample Output: 5.25
*/
public class ArrayAverage2
{
	float avg;
  public float num(int[] a2,int[] a3)
  {
	  float sum1 = 0;
	  float sum2 = 0;
    for(int i = 0; i < a2.length; i++)
    {
		sum1 = sum1 + a2[i];
	}
	 for(int j = 0; j < a3.length; j++)
	 {
			sum2 = sum2 + a3[j];
	 }
	float sum = sum1 + sum2;
	int r = a2.length + a3.length;
	avg = sum/r;
	return avg;
  }
}