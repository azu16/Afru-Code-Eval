/*Question: Given a non-empty string and an int N, return the string made starting with char 0, and then every N th char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
Sample Input: 1. everyNth("Miracle", 2) -> Mrce 2. everyNth("abcdefg", 2) -> aceg 3. everyNth("abcdefg", 3) -> adg
Sample Output: 1. everyNth("abcdefg", 3) -> adg
*/
public class StringN
{
  public String word(String s2,int n)
  {
	  String s3 = "";
	  char[] a = s2.toCharArray();
	  s3 = s3 + a[0];
	  for(int i = 1; i < a.length; i++)
	  {
		  if(i % n == 0)
		  {
			  s3 = s3 + a[i];
		  }

	  }
	  return s3;
  }
}