/*Question: The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
Sample Input: 1. makeTags("i", "Yay") -> <i>Yay</i> , 2. makeTags("i", "Hello") -> <i>Hello</i> ,
Sample Output: 3. makeTags("cite", "Yay") -> <cite>Yay</cite>
*/
public class Html
{
	String s7 = "";
  public String word(String tag,String word)
  {
	  String s5 = "<";
	  String s6 = ">";
	  String s8 = "/";
	  s7 =s7+s5+tag+s6+word+s5+s8+tag+s6;
       return s7;
  }

}