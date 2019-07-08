import java.util.Scanner;
class binary
{ public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   int flag=0;
   int arr[]={10,33,41,52,71,99,117};
   System.out.print("Enter the number to be searched:");
   int n=sc.nextInt();
   int min=0,max=arr.length-1;
   while (min<=max)
   { int mid=(min+max)/2;
     if (arr[mid]==n)
	 { System.out.print("Number found");
	   flag=1;
	   break;
	 }
	 else if(arr[mid]<n)
	 { min=mid+1;
	 }
	 else if(arr[mid]>n)
	 { max=mid-1;
	 }
   }
   if(flag==0)
   { System.out.print("Number not found");
   }
 }
}