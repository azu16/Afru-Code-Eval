/*Question: Check if string has all unique characters(considering white spaces and case sensitivity). Eg: i/p : reghav o/p : true i/p : raghav o/p : false
Sample Input: 1)reghav ->true 2)raghav ->false
Sample Output: 3. java->false
*/
public class Unique
{
	boolean  b1;
  public boolean find(String s1)
  {

	  char[] a = s1.toCharArray();

	  for(int i = 0; i < a.length; i++)
	  {
		 for(int j = i+1; j < a.length; j++)
		 {

			 if(a[i] == a[j])
			 {

				 return b1;
			 }
		 }
	  }
	   b1 = true;
	   return b1;
  }
}