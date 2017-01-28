/*Question: Pass an int array and an int and do a search of the second parameter in the first, and return true/false.
Sample Input: {1,2,4,5,6,8} , 4 ->true , {2,4,5,3} ,8 ->false
Sample Output: {12,3,5,6,8} ,2 ->false
*/
public class SearchInt
{
	boolean comp;
  public boolean find(int[] a1,int j)
  {
	  for(int m = 0; m < a1.length; m++)
	  {
		  if(a1[m] == j)
		  {
		   comp = true;
		   break;
	     }
		   else
		     comp = false;
	  }
	  return comp;

  }
 }