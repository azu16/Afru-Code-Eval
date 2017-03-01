/*Question: Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
Sample Input: 1. twoAsOne(1, 2, 3) -> true 2. twoAsOne(3, 1, 2) -> true
Sample Output: 3. twoAsOne(3, 2, 2) -> false
*/


//AFRU COMMENTS : Please initialize 'b1'
public class SumOfTwo
{
	boolean b1;
  public boolean sum(int a, int b, int c)
  {
	  if(a > b && a > c)
	  {
		  if(a == (b + c))
		  b1 = true;
		  return b1;
	  }
	  if(c > a && c > b)
	  {
	    if(c == (a + b))
	    {
			b1 = true;
			return b1;
		}
      }
	 return b1;
  }
}
