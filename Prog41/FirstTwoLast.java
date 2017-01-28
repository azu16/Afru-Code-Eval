/*Question: Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
Sample Input: 1. frontAgain("edited") -> true , 2. frontAgain("edit") -> false ,
Sample Output: 3. frontAgain("ed") -> true
*/
public class FirstTwoLast
{
	boolean b1;
	String f1 = "";
	String f2 = "";
	String f = "";
 public boolean find(String s1)
 {
	 char[] a = s1.toCharArray();
	 for(int i = 0; i < a.length; i++)
	 {
		 if(i < 2)
		 {
			f1 = f1 + a[i];
	     }
	 }
	 System.out.println(f1);
	 for(int j = a.length - 2; j < a.length; j++)
	 	 {

	 			f2 = f2 + a[j];

	 }
	 System.out.println(f2);
	  if(f1.equals(f2))
	  b1 = true;
	 return b1;
 }
}