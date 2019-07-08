import java.util.Scanner;
class ciel
{
	public static void main(String agrs[])
	{
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if((a-b)%10==9)
			System.out.print(a-b-1);
		else 
			System.out.print(a-b+1);
	}
}