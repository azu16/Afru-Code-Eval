public class TestMiddleArray
{
  public static void main(String args[])
  {
          int[] a = {1,2,3};
          int[] a1 = {4,5,6};
	  MiddleArray m = new MiddleArray();
	  int[] a2  = new int[2]; 
	  a2 = m.mid(a,a1);
	  for(int i = 0; i < a2.length; i++)
	  {
	  System.out.println(a2[i]);
	  }
  }
}