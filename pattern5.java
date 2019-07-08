import java.util.Scanner;
class pattern5
{ 
   public static void main(String args[])
  {   
       System.out.print("Enter a string:");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       sc.close();
       char[] a=s.toCharArray();
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<=i;j++)
          {
               System.out.print(a[j]);  
           }
System.out.println();
  }   }
}