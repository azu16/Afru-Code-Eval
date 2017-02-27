/*Question: Pass two ints as parameter and return the sum of numbers.
 Sample Input: 2,3->5 5,-3->2
 Sample Output: 5,4->9
*/

public class Sum
{
  public static long num(int a, int b)
  {
       //Business logic
        long res = (long)a + b;
          return res;
  }
  public static void main(String args[]){
   long l = Sum.num(10,20);
   long l1 = Sum.num(-100,20);
   long l2 = Sum.num(-1089,-3420);
   
   //Afru Comments --> can you explain me what are you doing in this command?
   long l3 = Sum.num(-1 >>> 1,-1 >>> 1);

   System.out.println("The sum of two numbers is: "+l);
   System.out.println("The sum of two numbers is: "+l1);
   System.out.println("The sum of two numbers is: "+l2);
   System.out.println("The sum of two numbers is: "+l3);
  }
  }
