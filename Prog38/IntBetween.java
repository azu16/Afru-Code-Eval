/*Question: Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
Sample Input: 1. (30 , 31 ) 2. (30, 41 ) 3. (40, 50 )
Sample Output: 1. true 2. false 3. true
*/
public class IntBetween
{
	boolean f;
  public boolean find(int i , int j)
  {
	  if((i > 29 && i < 41) && (j > 29 && j < 41) )
	  {
		  f = true;
		  return f;
	  }
	  if((i > 39 && i < 51) && (j > 39 && j < 51) )
	  	  {
	  		  f = true;
	  		  return f;
	  }
	    return f;

  }
}