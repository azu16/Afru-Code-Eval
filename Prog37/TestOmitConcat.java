public class TestOmitConcat
{
  public static void main(String args[])
  {
	  String s = "Hello";
	  String s1 = "There";
	  OmitConcat o = new OmitConcat();
	  String s2 = o.word(s,s1);
	  System.out.println(s2);
  }
}