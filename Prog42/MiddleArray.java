/*Question: Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
Sample Input: 1. middleWay({1, 2, 3}, {4, 5, 6}) -> {2, 5} 2. middleWay({7, 7, 7}, {3, 8, 0}) -> {7, 8}
Sample Output: 3. middleWay({5, 2, 9}, {1, 4, 5}) -> {2, 4}
*/
public class MiddleArray
{
	int[] c;
  public int[] mid(int[] b,int[] b1)
  {
	  int n = 0;
	  int m = 0;
	  for(int i = 1; i < b.length - 1; i++)
	  {
		   n = b[i];
	  }
	  for(int j = 1; j < b1.length - 1; j++)
	  {
	  		   m = b1[j];
	  }
	  c = new int[2];
	    c[0] = n;
	    c[1] = m;
	  return c;
  }
}


