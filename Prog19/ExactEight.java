/*Question: Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
Sample Input: 1. sum28({2, 3, 2, 2, 4, 2}) -> true 2. sum28({2, 3, 2, 2, 4, 2, 2}) -> false
Sample Output: 3. sum28({1, 2, 3, 4}) -> false
*/
public class ExactEight
{
	 int sum;
	 boolean b1;
  public boolean check(int[] a1)
  {
	  for(int i = 0; i < a1.length; i++)
	  {
		  if(a1[i] == 2)
		  {
			  sum+= 2;
		  }
	  }
	   if(sum == 8)
	     b1 = true;
	     return b1;
  }
  
 // Bring that if statement inside for loop - this will save any further look until the end of the array in case the sum is already 8.	
  public boolean afruCheck(int[] a1)
  {
      for(int i = 0; i < a1.length; i++)
      {
	  if(sum == 8)
	     return true;
          if(a1[i] == 2)
              sum+= 2;	   
      }
  }	  
}
