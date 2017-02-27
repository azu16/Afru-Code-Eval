/*Question: Write a program to generate Fibonacci series of limit number of elements.
Sample Input: 5 -> 0 1 1 2 3 6-> 0 1 1 2 3 5
Sample Output: 8 ->0 1 1 2 3 5 8 13
*/
public class Fibo1
{
	int[] arr = new int[10];
	
  // This function is very ill-implemented - in Fibonacci series we know a[0]=0 and a[1] is 1	
  //  Start for loop as i=2 and not as i=1+2 - it does not buy you anything, it reduces the readability
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
