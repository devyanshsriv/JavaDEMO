import java.util.*;
class bubble
{ public static void main(String args[])
  {
     int k=0;
     int arr[]={13,11,7,12,0,-1,13};
	 System.out.print("Sorted elements are:");
	 for(int i=0;i<arr.length;i++)
	 { for(int j=0;j<arr.length-i-1;j++)
	   { if(arr[j]>arr[j+1])
	     { int temp=arr[j];
		   arr[j]=arr[j+1];
		   arr[j+1]=temp;
		 }
		 k++;
	   }
	   
	 }
	System.out.print(Arrays.toString(arr));
    System.out.println("\n"+k);
   }
  }
