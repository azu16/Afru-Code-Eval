public class TestZeroArray
{
  public static void main(String args[])
  {
      int[] a = {0, 5,0,3};
     ZeroArray z = new ZeroArray();
      int[] a1= z.list(a);
      for(int  i = 0; i < a1.length; i++)
      {
       System.out.println(a1[i]);
      }

  }
}