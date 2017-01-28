/*Question: Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the original string. seeColor("redxx")-->"red" , seeColor("xxred")-->"xxred " , seeColor("blueTimes")-->"blue"
Sample Input: redxx->red xxred->xxred
Sample Output: blueTimes->blue
*/
public class RedString
{

  public String word(String s2)
  {

	 String s3 = s2.substring(0,3);
	 String s4 = s2.substring(0,4);
	 if(s3.equals("red"))
	 {
	 return s3;
     }
	 if(s4.equals("blue"))
	 {
	 return s4;
     }
     else
     {
	  return s2;
  }
  }
}