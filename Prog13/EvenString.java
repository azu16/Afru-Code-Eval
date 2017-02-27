/*Question: Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
Sample Input: 1. firstHalf("WooHoo") -> Woo 2. firstHalf("HelloThere") -> Hello
Sample Output: 3. firstHalf("abcdef") -> abc
*/

//AFru Comments ---> you can use string and use charAt() function instead of converting to char array
//Also use StringBuilder class --> read about it.
public class EvenString
{
	String fin = "";
  public String half(String s1)
  {
	   char[] a = s1.toCharArray();
	    for(int i = 0; i < (a.length/2); i++)
	    {
			fin = fin + a[i];
		}
		return fin;
  }
}
