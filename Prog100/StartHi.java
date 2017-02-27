/*Question: Given a string, return true if the string starts with "hi" and false otherwise. startHi("hi there")--> true , startHi("hi")--> true , startHi("hello hi")--> false
Sample Input: 1. startHi("hi there")->true 2. startHi("hi") ->true
Sample Output: 3. startHi("hello hi") ->false
*/
public class StartHi
{
	boolean b1;
  public boolean find(String s1)
  {
	  char[] a = s1.toCharArray();
	  if(a[0] == 'h' && a[1] == 'i')
	  {
	      b1 = true;
	      return b1;
	  }
	  return b1;
  }
	
  //Afru - Another way to implement - take a close look.
  public boolean find(String s1)
  {
      if(s.lowerCase().charAt(0)=='h' && s.lowerCase().charAt(1)=='i')
      {
          return true;
      }
      return false;
  }
  
  ////Afru - Another way to implement - very compact - just to see how many ways we can write.	
  public boolean find(String s1)
  {
      return(s.lowerCase().charAt(0)=='h' && s.lowerCase().charAt(1)=='i')?true:false;
  }
}
