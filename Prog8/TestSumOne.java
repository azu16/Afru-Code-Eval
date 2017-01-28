public class TestSumOne
{
  public static void main(String args[])
  {
	 int[] a1 = {1,2,3,4,5};
     SumOne s = new SumOne();
     s.arraySum(a1);
    long r = s.res;
     System.out.println(r);
  }
}