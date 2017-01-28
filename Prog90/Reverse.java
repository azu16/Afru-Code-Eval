/*Question: Pass a string as parameter. Reverse the string and return it. All the alphabets in the strings should be individually reversed and then returned.
Sample Input: Java Script ->tpircS avaJ Program ->margorP
Sample Output: result ->tluser

*/
public class Reverse
{
  public String word(String s2)
  {
	  StringBuilder sb = new StringBuilder(s2);
	  sb = sb.reverse();
	  String s3 = sb.toString();
	  return s3;
  }
}