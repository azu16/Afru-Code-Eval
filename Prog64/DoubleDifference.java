/*Question: Given an int N,return the absolute difference between N and 21, except return double the absolute difference if N is over 21. diff21(19) --> 2 , diff21(10)--> 11 , diff21(21)-->0 , diff21(23)--> 4 ,
Sample Input: 19 ->2 10 ->11
Sample Output: 21-> 0
*/
public class DoubleDifference
{
	int bal;
  public int num(int n)
  {
	  if(n > 21)
	  {
		 bal = ((n - 21)*2);
		 return bal;
	  }
	  else
	   {
		   bal = 21 - n;
		   return bal;
	   }
  }
}