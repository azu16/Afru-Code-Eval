/*Question: Write a program to generate Fibonacci series of limit number of elements.
Sample Input: 5 -> 0 1 1 2 3 6-> 0 1 1 2 3 5
Sample Output: 8 ->0 1 1 2 3 5 8 13
*/
public class Fibo1
{
	int[] arr = new int[10];
  public int[] num(int n)
   {     int i = 0;
 	    arr[i] = 0;
 	    arr[i + 1] = 1;
 	    for( i = i + 2; i < n; i++)
 		  {
 			   arr[i] = arr[i - 2] + arr[i - 1];


 	  }
 	  return arr;
  }


 }