/*Question: Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". helloName("Bob")-->"Hello Bob!" , helloName("Alice")-->"Hello Alice!" , helloName("X")-->"Hello X!"
Sample Input: Bob->Hello Bob! Alice->Hello Alice!
Sample Output: X->Hello X!
*/
public class HelloString
{
  public String word(String s2)
  {
	  char[] a = s2.toCharArray();
	  int n = a.length;
	  String s3 = "Hello ";
	  for(int i = 0; i < a.length; i++)
	  {
		  s3 = s3 + a[i];
	  }
	  s3 = s3 + "!";
	  return s3;
  }
}