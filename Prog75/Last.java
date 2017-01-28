/*Question: Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
Sample Input: 7 , 17 ->true 12 ,21 ->false
Sample Output: 12,4 ->false
*/
public class Last
{
	boolean b1;
  public boolean find(int a, int b)
  {
	  int r1 = a % 10;
	  int r2 = b % 10;
	  if(r1 == r2)
	  {
	     b1 = true;
	     return b1;
	  }
	  return b1;
  }
}