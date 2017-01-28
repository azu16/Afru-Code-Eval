
public class TestFibo1
{
  public static void main(String args[])
  {
	    Fibo f  = new Fibo();
	     int k = 5;
	     int[] a = f.num(k);
	      for(int j = 0; j < k; j++)
	      {
	        System.out.print(a[j]+" ");
	      }
  }
}