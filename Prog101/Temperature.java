/*Question: Given two temperatures, return true if one is less than 0 and the other is greater than 100. icyHot(120, -1)--> true , icyHot(-1, 120)--> true , icyHot(2, 120) --> false
Sample Input: 1. icyHot(120, -1) ->true 2. icyHot(-1, 120) -true
Sample Output: 3. icyHot(2, 120) ->false
*/
public class Temperature
{
	boolean b1;
  public boolean find(int a, int b)
  {
	  if(a > 100 || b > 100)
	  {
		  if(a < 0 || b < 0)
		  {
			  b1 = true;
			  return b1;
		  }
	  }
	  //Think carefully - do you need this if statement?
	  if(a < 0 || b < 0)
	  {
		  if(a > 100 || b > 100)
		  {
			  b1 = true;
			  return b1;
		  }
	   }
	   return b1;
  }
}
