/*Question: Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
Sample Input: 1. atFirst("hello") -> "he" , 2. atFirst("hi") -> "hi" ,
Sample Output: 3. atFirst("h") -> "h@"
*/
public class LengthTwo
{
  public String word(String s2)
  {
	  String f = "";
	  char[] a = s2.toCharArray();
	  if(a.length < 2)
	  {
		  f = f + a[0] + "@";
		  return f;
	  }
	  for(int i = 0; i < 2; i++)
	  {
		  f = f + a[i];
	  }
	  return f;
  }
}