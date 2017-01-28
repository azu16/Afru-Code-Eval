/*Question: Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
Sample Input: 1. stringBits("Hello") -> "Hlo" , 2. stringBits("Hi") -> "H" ,
Sample Output: 3. stringBits("Heeololeo") -> "Hello"
*/
public class AltCharacter
{
	 String fin = "";
  public String word(String s1)
  {
	  char[] a = s1.toCharArray();
	  for(int i = 0; i < a.length; i+= 2)
	  {
		  fin = fin + a[i];
	  }
	  return fin;
  }
}