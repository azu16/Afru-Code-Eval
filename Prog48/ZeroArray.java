/*Question: Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
Sample Input: 1. zeroMax({0, 5, 0, 3}) -> {5, 5, 3, 3} 2. zeroMax({0, 4, 0, 3}) -> {3, 4, 3, 3}
Sample Output: 3.zeroMax({0, 1, 0}) -> {1, 1, 0}
*/
public class ZeroArray
{

 public int[] list(int[] a2)
 {
	  int temp = 0;
	  int k = 0;
	 int[] a3 = new int[a2.length];
	 for(int j = 0; j < a2.length; j++)
	 {
		 if(j == a2.length - 1)
		 {
			if(a2[j] == 0)
			{
				a3[j] = 0;
			}
			else
			  a3[j] = a2[j];
			  break;
		 }
		 if(a2[j] == 0)
		 {
			 for( k = j + 1; k < a2.length; k++)
			 {
				 if(a2[k] % 2 != 0)
				 {
					  if(a2[k] > temp)
					  temp = a2[k];
				 }
			 }
			 a3[j] = temp;
			 temp = 0;
			 continue;
		 }
		 a3[j] = a2[j];
 	 }
 	 return a3;
 }
}