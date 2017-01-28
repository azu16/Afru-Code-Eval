/*Question: Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
Sample Input: 1. theEnd("Hello", true) -> H 2. theEnd("Hello", false) -> o
Sample Output: 3. theEnd("oh", true) -> o
*/
public class StringTrue
{

 public String word(String s2,boolean b)
 {
	 String s3 = "";
	 char[] a = s2.toCharArray();
	 if(b == true)
	 {
		  s3 = s3 + a[0];
		 return s3;
	 }
	 else
	 {
		 s3 = s3 + a[a.length - 1];
		 return s3;
	 }


 }
}