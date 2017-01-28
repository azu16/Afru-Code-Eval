public class TestSearchInt
{

  public static void main(String args[])
  {
	  int[] a = {1,2,4,5,6,8};
	  int i = 4;
	 SearchInt s = new SearchInt();
	 boolean b = s.find(a,i);
	 System.out.println(b);
  }
}