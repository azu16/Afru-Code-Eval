/*Question: Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
Sample Input: 1. countXX("abcxx") -> 1 , 2. countXX("xxx") -> 2 ,
Sample Output: 3. countXX("xxxx") -> 3
*/
public class DoubleX
{
	int count;
  public int find(String s1)
  {
	  char[] a = s1.toCharArray();
	  for(int i = 0; i < a.length - 1; i++)
	  {
		  if(a[i] == 'x')
		  {
			  if(a[i + 1] == 'x')
			  {
				  count++;
			  }
		  }
	  }
	  return count;
  }
}