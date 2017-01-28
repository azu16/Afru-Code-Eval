/*Question: Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
Sample Input: 1. or35(3)-> true , 2. or35(10) -> true ,
Sample Output: 3. or35(8)-> false
*/
public class Multiple1{
 public static int num(int n){
    if(n % 3 == 0 || n % 5 == 0){
        return 1;
    }
       return 0;
 }
  public static void main(String args[]){
     int i = Multiple1.num(4);
     if(i == 1){
        System.out.println("True");
     }
     else
         System.out.println("False");

  }
  }