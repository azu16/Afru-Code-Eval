public class TestExactEight
{
  public static void main(String args[])
  {
	  int[] a = {1,2,3,2,4,2,5};
	  ExactEight e = new ExactEight();
	  boolean b = e.check(a);
	  System.out.println(b);
  }
}