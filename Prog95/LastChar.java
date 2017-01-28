/*Question: Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. backAround("cat")-->tcatt , backAround("Hello")-->oHelloo , backAround("a")-->aaa
Sample Input: cat->tcatt Hello->oHelloo
Sample Output: a->aaa
*/
public class LastChar
{
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	   String f = "";
	   f = f + a[a.length-1];
	   for(int i = 0; i < a.length; i++)
	   {
		   f = f + a[i];
	   }
	   f = f + a[a.length-1];
	   return f;
  }
}