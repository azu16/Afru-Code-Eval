/*Question: Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
Sample Input: 1. endUp("Hello") -> HeLLO 2. endUp("hi there") -> hi thERE
Sample Output: 3. endUp("hi") -> HI
*/
public class LastThree
{
  public String word(String s2)
  {
	  String f1 = "";
	  String f2 = "";
	  String f4 = "";
	  String f;
     char[] a = s2.toCharArray();
     if(a.length < 3)
     {
		for(int i = 0; i < a.length; i++)
		{
			f4 = f4 + a[i];
		}
		f = f4.toUpperCase();
		return f;
	 }
     for(int i = 0; i < a.length - 3; i++)
     {
		 f1 = f1 +a[i];
	 }
	 for(int j = a.length - 3; j < a.length; j++)
	 {
		 f2 = f2 + a[j];
	 }
	 String f3 = f2.toUpperCase();
	  f = f1.concat(f3);
	  return f;
  }
}