/*Question: Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged
Sample Input: 1. delDel("adelbc") -> abc 2. delDel("adelHello")-> aHello
Sample Output: 3. delDel("adedbc") -> adedbc
*/
public class DelString
{
  public String word(String s2)
  {
	  String f1 = "";
	  String f2 = "";
	  String f = "";
	  char[] a = s2.toCharArray();
	  boolean  b = s2.contains("del");
	  StringBuilder sb1 = new StringBuilder(s2);
	  if(b == true)
	  {
		  int n = sb1.indexOf("del");
		  System.out.println(n);
		  if(n == 0)
		  {
			  return s2;
		  }
		  else
		  {
		  for(int i = 0; i < n; i++)
		  {
			  f1 = f1 + a[i];
		  }
		  for(int j = n + 3; j <= a.length - 1; j++)
		  {
			  f2 = f2 + a[j];
		  }
		  f = f1 + f2;
           return f;
	      }
      }
      else
         return s2;


  }
}