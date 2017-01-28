/*Question: Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length will be greater than 4. arrayFront9({1, 2, 9, 3, 4})-->true , arrayFront9({1, 2, 3, 4, 9})-->false , arrayFront9({1, 2, 3, 4, 5})-->false
Sample Input: a[]={1,2,9,3,4} ->true a[]={1, 2, 3, 4, 9) ->false
Sample Output: a[]=({1, 2, 3, 4, 5})->false
*/
public class GivenArray
{
  boolean comp;
    public boolean num(int[] a1)
      {
    	   if(a1.length > 4)
    	   {
    		  for(int i = 0; i < 4; i++)
    		  {
    			  if(a1[i] == 9)
    			   comp = true;

           	  }

    	    }
    	   	 else
    	   	 {
    			 for(int j = 0; j < a1.length; j++)
    			 {
    				 if(a1[j] == 9)
    				 comp = true;
    			 }


    		 }
  		 return comp;
}
}
