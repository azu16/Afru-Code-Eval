/*Question: Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
Sample Input: 1. close10(8, 13) -> 8 2. close10(13, 8) -> 8
Sample Output: 3. close10(13, 7) -> 0
*/
public class NearTen
{
	int diff;
  public int num(int a, int b)
  {
	  int d = 0;
	  int d1 = 0;

	  if(a > 10)
	  {
	   d = a - 10;
      }
	  else
	  {
	    d = 10 - a;
      }
	  if(b > 10)
	  {
	    d1 = b - 10;
      }
	   else
	   {
	     d1 = 10 - b;
       }
	  if(d > d1)
	  {
		  diff  = b;
		  return diff;
	  }
	  else if(d < d1)
	   {
		   diff = a;
		   return diff;
       }
       else
           return diff;
  }
}