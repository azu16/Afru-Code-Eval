/*Question: Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
Sample Input: 1. lastTwo("coding") -> "codign" , 2. lastTwo("cat") -> "cta" ,
Sample Output: 3. lastTwo("ab") -> "ba"
*/
public class SwapChar
{
	 String f = "";
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	   char temp = a[a.length - 2];
	   a[a.length - 2] = a[a.length - 1];
	   a[a.length - 1] = temp;
	    for(int i = 0; i < a.length; i++)
	    {
			f = f + a[i];
		}
		return f;
  }
 }