/*Question: Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
Sample Input: 1. altPairs("kitten") -> "kien" , 2. altPairs("Chocolate") -> "Chole" ,
Sample Output: 3. altPairs("CodingHorror") -> "Congrr"
*/
public class CharIndexes
{
	String f = "";
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();

	     f = f + a[0] + a[1];
	  for(int i = 2; i < a.length; i++)
	  {
		  if(i == 4 || i == 5 || i == 8 || i == 9 )
		  f = f + a[i];

	  }
	  return f;
  }
}
