/*Question: Given two strings, append them together (known as "concatenation") and return the result.
Sample Input: Hello , Java ->Hello Java Ram , Leela ->Ram Leela
Sample Output: java ,world ->java world
*/

public class Concat1{
public static void add(String a, String b){
  String c = a + b;
  System.out.println("Concatenated Strings are: "+c);
}
public static void main(String args[]){
  Concat1.add("dog","cat");
  Concat1.add("dog","145");
  Concat1.add("15","895");

}
}