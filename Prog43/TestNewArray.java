public class TestNewArray
{
  public static void main(String args[])
  {
          int[] a = {6,1,2,4,5,8};
      	  NewArray n = new NewArray();
	  int[] a1 = n.list(a,3);
	  for(int i = 0; i < a1.length; i++)
	  {
	  System.out.println(a1[i]);
	  }
  }
}