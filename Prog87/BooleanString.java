/*Question: Pass a string as parameter and return a boolean to indicate whether the string passed is a boolean or not.
Sample Input: Happy
Sample Output: false

*/
public class BooleanString
{
  boolean b2;
 public boolean find(String s1)
 {
   s1 = s1.toLowerCase();
   int n = s1.length();
   if(n == 4)
   {
      if(s1.contains("true"))
	  {
	 	   b2 = true;
	 	   return b2;
      }
   }
    if(n == 5)
	{
	      if(s1.contains("false"))
		  {
		 	   b2 = true;
		 	   return b2;
	      }
   }

     return b2;

 }
}