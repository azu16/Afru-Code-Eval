public class TestReverseArray
{
  public static void main(String args[])
  {
      int[] a = {1,2,3,7,4};
      ReverseArray  r= new ReverseArray();
      int[] a1 = r.list(a);
      for(int i = 0; i < a.length; i++)
      {
       System.out.println(a1[i]);
      }

  }
}