/*Question: We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 any where in the array.
Sample Input: 1. unlucky1({1, 3, 4, 5}) -> true 2. unlucky1({2, 1, 3, 4, 5}) -> true
Sample Output: 3. unlucky1({1, 1, 1}) -> false
*/
public class Unlucky
{
	boolean b1;
  public boolean find(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {

		      if(a1[i] == 1)
		      {
			      if(i == a1.length - 1)
			      {
	  			   return b1;
		           }
		        else
		         {
			       if(a1[i+1] == 3)
			       {
				    b1 = true;
				     return b1;
			       }
		       }
		  }
	  }
     return b1;
  }
}