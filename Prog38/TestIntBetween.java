public class TestIntBetween
{
  public static void main(String args[])
  {
	  int a = 40;
	  int b = 51;
	  IntBetween i = new IntBetween();
	  boolean b1 = i.find(a,b);
	  System.out.println(b1);
  }
}