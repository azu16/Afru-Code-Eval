/*Question: Pass two strings.Check one is the permutation of the other. Case sensitivity and white space should be considered. First you check the lengths (n), if they are not same, they cannot be permutations of each other.The frequency of each character in the first string should be same as the second String.Then only you can say that the string1 is a permutation of the other eg: i/p o/p uttara,rutata - true uttara,rutrta - false java, Ja va - false
Sample Input: 1)uttara,rutata 2)uttara,rututa 3)java, Ja va
Sample Output: 1)true 2)false 3)false
*/
public class Permutation
{
	boolean b1;
  public boolean find(String s2,String s3)
  {
	   int count = 0;
	  char[] a = s2.toCharArray();
	  char[] a1 = s3.toCharArray();
	  int n = a.length;
	  int m = a1.length;
	  System.out.println(n);
	  System.out.println(m);
	  if(n != m)
	  {
		  return b1;
	  }
	abc:  for(int i = 0; i < a1.length; i++)
	  {
		  for(int j = 0; j < a.length; j++)
		  {
			  if(a1[i] == a[j])
			  {
				  continue abc;
			  }

		  }
		  return b1;
	  }
	   b1 = true;
      return b1;
  }
}