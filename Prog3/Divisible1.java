/*Question: Pass an int as parameter. Test whether the number is divisible by 7 or not . 77-->true , 17-->false
Sample Input: 12 -> false 21 -> true
Sample Output: false
*/
public class Divisible1{
public static void param(int n){
  if(n % 7 == 0){
   System.out.println(n+" is divisible by 7");
  }
  else
  System.out.println(n+" is not divisible by 7");
}
public static void main(String args[]){
  Divisible1.param(77);
  Divisible1.param(17);
}
}