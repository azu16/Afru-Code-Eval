/*Question: Given a string and an int n, return a string made of the first and last ' n' chars from the string. The string length will be at least n.
Sample Input: 1. nTwice("Hello", 2) -> Helo , 2. nTwice("Chocolate", 3) -> Choate ,
Sample Output: 3. nTwice("Chocolate", 1) -> Ce
*/
public class FirstLast
{
	 String t = "";
  public String arrange(String s1,int m)
  {
	  char[] a = s1.toCharArray();
	  for(int i = 0; i < m; i++)
	  {
		  t = t + a[i];
	  }
	  for(int j = a.length - m; j < a.length  ; j++)
	  	  {
	  		  t = t + a[j];
	  }

	   return t;
  }
}