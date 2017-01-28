/*Question: We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
Sample Input: 1. (13, 20, 10) -> true 2. (20, 19, 10)-> true 3. (20, 10, 13) > true
Sample Output: 1. (10,10,12) ->false
*/
public class Teen
{
	boolean a1,b1,c1,bf;
  public boolean find(int a,int b,int c)
  {
	  if(a >= 13 && a <= 19)
	  {
	      a1 = true;
	  }
	  if(b >= 13 && b <= 19)
	  {
		  b1 = true;
	  }
	  if(c >= 13 && c <= 19)
	  {
		  c1 = true;
	  }
	  if(a1 == true || b1 == true || c1 == true)
	  {
		  bf = true;
		  return bf;
	  }
      return bf;
  }
}