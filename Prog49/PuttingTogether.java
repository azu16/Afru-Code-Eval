/*Question: Given two strings, a and b, return the result of putting them together in the order 'abba', e.g. "Hi" and "Bye" returns "HiByeByeHi".
Sample Input: 1. makeAbba("Hi", "Bye")-> HiByeByeHi 2. makeAbba("Yo", "Alice")-> YoAliceAliceYo
Sample Output: 3. makeAbba("What", "Up") -> WhatUpUpWhat
*/
public class PuttingTogether
{
  public String word(String s3, String s4)
  {
	  String s5 = s3.concat(s4);
	  String s6 = s5.concat(s4);
	  String s7 = s6.concat(s3);
	  return s7;
  }
}