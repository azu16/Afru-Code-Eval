/*Question: Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
Sample Input: 1. withoutX("xHix") -> Hi 2. withoutX("xHi") ->Hi
Sample Output: 3. withoutX("Hxix") -> Hxi
*/
public class WithOutX
{
	String f = "";
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	  if(a[0] == 'x' && a[a.length - 1] == 'x')
	  {
	  for(int i = 1; i < a.length - 1; i++)
	  {
		 f = f + a[i];
	  }
	    return f;
     }
	 else if(a[0] == 'x')
	 {
	  	  for(int i = 1; i < a.length; i++)
	  	  {
	  		  f = f + a[i];
	      }
	      return f;
     }
	 else if(a[a.length - 1] == 'x')
	 {
	  	  for(int i = 0; i < a.length - 1; i++)
	  	  {
	  		  f = f + a[i];
	          }
	          return f;
         }
	      else
	     {
		  	  for(int i = 0; i < a.length; i++)
		  	  {
		  		  f = f + a[i];
	          }
	          return f;
	     }
  }
}
