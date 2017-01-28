/*Question: Accept a string as parameter. Find out how many consonants present in it.
Sample Input: Object Oriented ->8 Java ->2
Sample Output: Krishna ->5
*/
public class Consonants1
{
	 int count;
	 int con;
  public int countConsonents(String s)
  {
	    String s2 = s.toUpperCase();
	  //  System.out.println(s1);
	   char[] a = s2.toCharArray();
	   for(int i = 0; i < a.length; i++)
	   {
		  if(a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' || a[i] == ' ')
          count++;
       }
        int con = a.length - count;
       return con;
}
}