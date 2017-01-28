/*Question: We'll say that an element in an array is "notalone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is notalone is replaced by whichever value to its left or right is larger.
Sample Input: 1. notAlone({1, 2, 3}, 2) -> {1, 3, 3} , 2. notAlone({1, 2, 3, 2, 5, 2}, 2)->{1, 3, 3, 5, 5, 2} ,
Sample Output: 3. notAlone({3, 4}, 3) -> {3, 4}
*/
public class NotAlone
{
  public int[] list(int[] a2,int n)
  {
	  for(int j = 0; j < a2.length; j++)
	  {
		  if(a2[j] == n)
		  {
			  if(j == 0)
			  {
				  a2[j] = a2[j];
				  break;
			  }
			  if(j == a2.length - 1)
			  {
				  a2[j] = a2[j];
				  break;
			  }
			  if(a2[j-1] > a2[j+1])
			  a2[j] = a2[j-1];
			  else
			  a2[j] = a2[j+1];
		  }
	  }
	  return a2;
  }
}
