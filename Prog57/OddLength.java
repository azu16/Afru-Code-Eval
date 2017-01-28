/*Question: Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
Sample Input: 1. middleThree("Candy") -> "and" 2. middleThree("and") -> "and"
Sample Output: 3. middleThree("solving") -> "lvi"
*/
public class OddLength
{
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	  int n = a.length;
	  if(n == 3)
	  {
		  return s2;
	  }
	  else
	  {
	  int i = n/2;
	  String f = s2.substring(i-1,i+2);
	  return f;
     }
  }

}