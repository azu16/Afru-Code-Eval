/*Question: Given a string, return true if it ends in "ly".
Sample Input: 1. endsLy("oddly") -> true , 2. endsLy("y") -> false ,
Sample Output: 3. endsLy("oddy") -> false
*/
public class EndWith
{
	boolean b1;
  public boolean find(String s1)
  {
	   char[] a = s1.toCharArray();
	   String f = "";
	    f = f + a[a.length - 2];
	    String t = f + a[a.length - 1];
	    if(t.equals("ly"))
	    b1 = true;
	    return b1;
  }
}