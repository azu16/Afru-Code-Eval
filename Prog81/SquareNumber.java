/*Question: Pass an int as parameter. The method should return whether the number passed is a square (like i/p-> 100, 9, 16, etc -> o/p should be true) or not.
Sample Input: 100
Sample Output: true
*/
public class SquareNumber
{
	boolean b1;
  public boolean find(int n)
  {
	  double d = Math.sqrt(n);
	  int i = (int)d;
	  int j = i*i;
	  if(j == n)
	  {
		  b1 = true;
		  return b1;
	  }
	  return b1;
  }
}