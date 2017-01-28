/*Question: Accept a string as parameter. Find out how many digits are present in the string.
Sample Input: 19 th May 2021
Sample Output: 6

*/
public class DigitString
{
  int count;
  public int num(String s1)
  {
	  char[] a = s1.toCharArray();
	  for(int i = 0; i < a.length; i++)
	  {
		  if(a[i] == '0' || a[i] == '1' || a[i] == '2' || a[i] == '3' || a[i] == '4' || a[i] == '5' || a[i] == '6' || a[i] == '7' ||a[i] == '8' || a[i] == '9')
		  {
			  count++;
		  }
	  }
	  return count;
  }
}