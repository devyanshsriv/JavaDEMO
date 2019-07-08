import java.util.Scanner;
class NumberMirror
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<=100000)
		{
			System.out.println(n);
		}
		else
		{
			System.out.print("Invalid..");
		}
	}
}