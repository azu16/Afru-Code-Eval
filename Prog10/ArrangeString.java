/*Question: Given a string, return a new string where the first and last chars have been exchanged. frontBack("code") -> "eodc" , frontBack("a") -> "a" , frontBack("ab")-> "ba" , frontBack("PrograM")-> "MrograP" ,
Sample Input: 1. frontBack("code") -> eodc , 2. frontBack("a") ->a
Sample Output: 3. frontBack("ab") ->ba
*/
public class ArrangeString
{
	String fin = "";
  public String rev(String s1)
  {
	  char[] a = s1.toCharArray();
	      char temp = a[0];
	      a[0] = a[a.length - 1];
	      a[a.length - 1] = temp;
	      for(int i = 0; i < a.length; i++)
	      {
			  fin = fin + a[i];
		  }
		  return fin;
   }
/*Afru comments: are you aware of "StringBuilder" class - can you try to use it here? Can you tell me 
   why using StringBuilder will be better than string concatenation
*/	
 public String rev(String s1)
 {
     char[] a = s1.toCharArray();
     char temp = a[0];
     a[0] = a[a.length - 1];
     a[a.length - 1] = temp;
     //For Loop must omit first and last element	 
     for(int i = 1; i < a.length-1; i++)
	      {
			  fin = fin + a[i];
		  }
		  return fin;
   }


 }
