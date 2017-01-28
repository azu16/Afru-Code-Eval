/*Question: Given a string, return a version without both the first and last char of the string. The strings will be at least length 3.
Sample Input: 1. withouEnd2("Hello") -> ell , 2. withouEnd2("abc") -> b ,
Sample Output: 3. withouEnd2("abcd") -> bc
*/
public class WithoutFirstLast
{
	String s3 = "";
 public String word(String s2)
 {
	 char[] a = s2.toCharArray();
	 for(int i = 1; i < a.length - 1; i++)
	 {
	   s3 = s3 + a[i];
	 }
	 return s3;
 }
}
