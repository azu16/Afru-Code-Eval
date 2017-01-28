public class TestOneOrFour
{
  public static void main(String args[])
  {
	  int[] a = {1,4,1};
	  OneOrFour o = new OneOrFour();
	  boolean b = o.find(a);
	  System.out.println(b);
  }
}