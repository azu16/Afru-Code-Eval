public class TestShiftArray
{
  public static void main(String args[])
  {
      int[] a = {6,2,5,3};
      ShiftArray s = new ShiftArray();
      int[] a1 = s.list(a);
      for(int i = 0; i < a1.length; i++)
      {
        System.out.println(a1[i]);
       }

  }
}