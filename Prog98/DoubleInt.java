/*Question: Given two int values, return their sum. Unless the two values are the same, then return double their sum. sumDouble(1, 2)--> 3 , sumDouble(3, 2)--> 5 , sumDouble(2, 2)--> 8 ,
Sample Input: 1,2->3 3,2->4
Sample Output: 2,2->8
*/
public class DoubleInt
{
	int sum;
  public int sum(int a, int b)
  {
	if(a > b)
	{
		sum = sum + a +b;
		return sum;
	}
	else if(a < b)
	{
		sum = sum + a + b;
		return sum;
	}
	else
	 {
		 sum = (sum + ((a + b)*2));
		 return sum;
	 }
  }
}