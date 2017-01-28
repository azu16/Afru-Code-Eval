/*Question: Pass a string as parameter. Find out how many vowels present in it
Sample Input: WebApplication ->6 Java ->2
Sample Output: Program ->2
*/
public class Vowels
{
	 int count;
  public int countVowels(String s)
  {
	   char[] a = s.toCharArray();
	   for(int i = 0; i < a.length; i++)
	   {
		  if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U')
		    count++;
       }
       return count;
}
}