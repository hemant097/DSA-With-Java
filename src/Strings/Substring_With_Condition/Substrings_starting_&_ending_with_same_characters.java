package Strings.Substring_With_Condition;

/*You are given a string, you have to find the count of all such substrings which start and end
with the same character.

e.g. 
Substrings of 'abcab' which start and end with same characters, are
 "a", "abca", "b", "bcab", "c", "a", "b"

So total count is 7. Hence we print 7.
*/

import java.util.Scanner;
public class Main extends CheckSub{
  public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      Main main = new Main();
      System.out.println("Enter the string");
      String a=in.next();
      System.out.println(main.chk(a));  
  }
}
class CheckSub{
  int count=0;
  
  int chk(String s){
for(int i=0;i<s.length();i++)
{
          String bag="";
  for(int j=i;j<s.length();j++){ 
          bag+=s.charAt(j);
          if( bag.charAt(0)==bag.charAt(bag.length()-1))
          count++;
}

  
}
  return count;
      
  }}
