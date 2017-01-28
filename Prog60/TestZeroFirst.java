public class TestZeroFirst
{
  public static void main(String args[])
  {
      int[] a = {1, 0};
      ZeroFirst z = new ZeroFirst();
      int[] a1 = z.list(a);
      for(int i = 0; i < a1.length; i++)
      {
      System.out.println(a1[i]);
      }

  }
}