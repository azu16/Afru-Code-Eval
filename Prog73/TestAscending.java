public class TestAscending
{
  public static void main(String args[])
  {
      int[] a = {3,1,2,5,8,4,6,9,7};
      Ascending as = new Ascending();
      int[] a1 = as.list(a);
      for(int i = 0; i < a1.length; i++)
      {
       System.out.println(a1[i]);
       }


  }
}