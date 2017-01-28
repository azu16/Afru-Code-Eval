/*Question: Check the given number is odd or even ,The definition of an "even" number is that the number is divisible by "2" without a remainder. Mathematicians would write an even number: E = (2xN). Then E is always divisible by "2". The definition applies to all integers, positive and negative, including 0. 77 ->odd , 42 ->even
Sample Input: 12 ->even 13 ->odd
Sample Output: 23 ->odd
*/
public class EvenOrOdd1{
  public String num(int n){
   //Business Logic
      if(n % 2 == 0){
        return "even";
      }
      else
        return "odd";
  }
  public static void main(String args[]){
	  EvenOrOdd1 e = new EvenOrOdd1();
      String s =  e.num(77);
      String s1 =  e.num(42);
      System.out.println(s);
      System.out.println(s1);

  }
  }
