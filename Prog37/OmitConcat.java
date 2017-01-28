/*Question: Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 2.
Sample Input: 1. nonStart("Hello", "There")-> ellohere 2. nonStart("java", "code") -> avaode
Sample Output: 3. nonStart("shotl", "java") -> hotlava
*/
public class OmitConcat
{
	String f = "";
  public String word(String s3, String s4)
  {
	  String f1 = "";
	  String f2 = "";
	  char[] a = s3.toCharArray();
	  char[] b = s4.toCharArray();
	  for(int i = 1; i < a.length; i++)
	  {
		  f1 = f1 + a[i];
	  }
	  
	  for(int j = 1; j < b.length; j++)
	  {
	  		  f2 = f2 + b[j];
	  }
	 
	  f = f1 + f2;
	   return f;
  }
}