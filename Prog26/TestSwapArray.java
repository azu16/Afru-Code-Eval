public class TestSwapArray
{
  public static void main(String args[])
  {
	  int[] a = {1,2,3,4,5};
	  SwapArray s = new SwapArray();
	  int[] a1 = s.mod(a);
	  for(int i = 0; i < a1.length; i++)
	  {
	  System.out.println(a1[i]);
	  }
  }
}