import java.util.Scanner;
class Remainder
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of test cases:");
  int T=sc.nextInt();
  int C=0;
  for(int i=1;i<=T;i++)
  { 
   System.out.print("Enter the value of A & B:");
   int A=sc.nextInt();
   int B=sc.nextInt();
   
    C=A%B;
    System.out.println(C);
  }
 }
}