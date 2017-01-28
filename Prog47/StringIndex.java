/*Question: Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
Sample Input: 1. twoChar("java", 0) -> ja 2. twoChar("java", 2) -> va
Sample Output: 3. twoChar("java", 3) -> ja
*/
public class StringIndex
{

  public String word(String s2,int n)
  {
	  String f1 = "";
	  String f;
	  char[] a = s2.toCharArray();
	  if(n == 0)
	  {
		  for(int i = 0; i < 2; i++)
		  {
			  f1 = f1 +a[i];
		  }
		  return f1;
	  }
	  if(n == a.length - 1 || n == a.length || n > a.length )
	  {
		  for(int j = 0; j < 2; j++)
		  {
    		  f1 = f1 +a[j];
		  }
		  return f1;
	  }
	  int j = n + 1;
	  for(int k = n; k <= j; k++)
	  {
		  f1 = f1 + a[k];
	  }
	  return f1;
  }
}