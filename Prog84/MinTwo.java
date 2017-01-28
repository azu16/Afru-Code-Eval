/*Question: Passing 2 arrays of ints to a method. The method should return the minimum value present across both the array elements.
Sample Input: a[]= 12,34,52,13 b[]= 99,10,23,42,77
Sample Output: 10

*/
public class MinTwo
{
	int temp = -1 >>> 1;
	int temp1 = -1 >>> 1;
  public int num(int[] a2,int[] a3)
  {
	  for(int i = 0; i < a2.length; i++)
	  {
		  if(a2[i] < temp)
		  {
			  temp = a2[i];
		  }
	  }
	  System.out.println(temp);
	  for(int j = 0; j < a3.length; j++)
	  {
	  	  if(a3[j] < temp1)
	  	  {
	  		  temp1 = a3[j];
	  	  }
	  }
	  System.out.println(temp1);
	  if(temp < temp1)
	   return temp;
	   else
	     return temp1;
  }
}