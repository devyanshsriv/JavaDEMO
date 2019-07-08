import java.util.*;
 
class Name
{
   public static void main(String args[])
   {
      String name, reverse = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      name = sc.nextLine();
 
      int length = name.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + name.charAt(i);
 
      System.out.println(reverse);
   }
}