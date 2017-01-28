public class TestVowels
{
  public static void main(String args[])
  {
	  String s1 = "WebApplication";
    Vowels v = new Vowels();
    int c = v.countVowels(s1);
    System.out.println(c);
  }
}