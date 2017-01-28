/*Question: Return true if the given string contains 1 or 3 'e' chars. Otherwise return false.
Sample Input: 1. stringE("Hello") -> true 2. stringE("Heelle") ->true
Sample Output: 3. stringE("Heelele") -> false
*/
public class OneOrThree
{
	 int count;
	 boolean b1;
  public boolean find(String s1)
  {
	  char[] a = s1.toCharArray();
	  for(int i = 0; i < a.length; i++)
	  {
		   if(a[i] == 'e')
		   count++;
	  }
	  if(count == 1 || count == 3)
	    b1 = true;
	    return b1;
  }
}