public class TestNotAlone
{
  public static void main(String args[])
  {
      int[] a = {3, 4};
      NotAlone m = new NotAlone();
      int[] a1 = m.list(a,3);
      for(int i = 0; i < a1.length; i++)
      {
      System.out.println(a1[i]);
      }

  }
}