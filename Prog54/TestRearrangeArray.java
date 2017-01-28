public class TestRearrangeArray
{
  public static void main(String args[])
  {
      int[] a = {2, 2, 2};
      RearrangeArray r = new RearrangeArray();
      int[] a1 = r.list(a);
      for(int i = 0; i < a1.length; i++)
      {
       System.out.println(a1[i]);
      }

  }
}