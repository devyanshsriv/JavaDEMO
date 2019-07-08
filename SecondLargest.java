public class SecondLargest 
{	public static void main(String[] args) 
   {
        int arr[] = { 1, 46, 0, 47, 86, 2, 52, 4, 36, 77, 85 };
		int lar =arr[0];
		int slar =arr[0];
		int small=arr[0];
		int ssmall=arr[0];
		//Second Largest
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) 
		{
 
			if (arr[i] > lar) 
			{
				slar = lar;
				lar = arr[i];
 
			} else if (arr[i] > slar) 
			{
				slar = arr[i];
 
			}
			if (arr[i] < small) 
			{
				ssmall = small;
				small= arr[i];
 
			} else if (arr[i] < ssmall) 
			{
				ssmall = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + slar);
		System.out.println("\nSecond smallest number is:" + small);
		System.out.println("\nSecond smallest number is:" + ssmall);
		
	}
}