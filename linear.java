import java.util.Scanner;
class linear
{ public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
  int flag=0,n;
  int arr[]={4,6,7,23,67,101};
  System.out.print("Enter the number you want to search ");
   n=sc.nextInt();
   for(int i=0;i<arr.length;i++)
  
  {  if(arr[i]==n)
     { System.out.print("Number Found");
	   flag=1;
	   break;
	 }
     
  }
  if(flag==0)
     {  System.out.print("Number not in the array");
	 } 
 }  
}