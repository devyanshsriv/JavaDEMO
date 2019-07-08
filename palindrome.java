import java.util.Scanner;
class palindrome
{ 
   public static void main(String args[])
   {  
       Scanner sc=new Scanner(System.in);
       int num,r, rev=0,ori;
       System.out.print("Enter the value:");
       num=sc.nextInt();
       ori=num;
       while (num>0)
       {
           r=num%10;
           rev=(rev*10)+r;
           num=num/10;
       }
       if(ori==rev)
{
       System.out.println("Palindrome Number");
  }
     else
{
       System.out.println("Not a Palindrome");
  }
}
}