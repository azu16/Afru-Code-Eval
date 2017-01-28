/*Question: Pass two Strings. Check whether the second String is rotated form of the first String.
Sample Input: 1)hello , llohe ->true 2)happy , pphay ->false
Sample Output: 3.Rama,krish ->false
*/
public class Rotate
{
	boolean b1;
  public boolean word(String s2, String s3)
  {
	  int count = 0;
	  s2 = s2.toUpperCase();
	  s3 = s3.toUpperCase();
	  char[] a = s2.toCharArray();
	  char[] a1 = s3.toCharArray();
	  if(a.length != a1.length)
	  {
		  return b1;
	  }
abc:  for(int i = 0; i < a1.length; i++)
	  {
xyz:	  for(int j = 0; j < a.length; j++)
		  {
			  if(a[i] == a[j])
			  {
				  count++;
				  continue abc;
			  }
		  }
	  }
	  System.out.println(count);
	  if(count == s2.length())
	  {
		  b1 = true;
		  return b1;
	  }
	  return b1;
  }
}