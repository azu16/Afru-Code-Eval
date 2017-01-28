/*Question: Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 4.
Sample Input: 1. middleTwo("string") -> ri , 2. middleTwo("code") -> od ,
Sample Output: 3. middleTwo("Practice") -> ct
*/
public class MiddleString
{
	 String f = "";
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	   int i = a.length;
	   int j = i/2;
	   f = f + a[j -1] + a[j];
	   return f;
  }
}