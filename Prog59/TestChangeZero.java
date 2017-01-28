public class TestChangeZero
{
  public static void main(String args[])
  {
      int[] a = {1, 2, 1};
      ChangeZero c = new ChangeZero();
      int[] a1 = c.list(a);
      for(int i = 0; i < a1.length; i++)
      {
      System.out.println(a1[i]);
      }

  }
}