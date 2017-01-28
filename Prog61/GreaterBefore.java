/*Question: Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
Sample Input: 1. scoresIncreasing({1, 3, 4}) -> true 2. scoresIncreasing({1, 3, 2}) -> false
Sample Output: 3. scoresIncreasing({1, 1, 4}) -> true
*/
public class GreaterBefore
{
	boolean b1;
 public boolean find(int[] a1)
 {
	     int i = 1;
     	 if(a1[i] >= a1[i-1])
		 {
			 for(int j = i+1; j < a1.length; j++)
			 {
				 if(a1[j] >= a1[j-1])
				   continue;
				 else
				   return b1;
			 }
			 b1 = true;
			 return b1;
		 }
		 return b1;

 }
}