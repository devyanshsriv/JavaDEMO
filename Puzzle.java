import java.util.Scanner;
class Puzzle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[][]=new int[3][3];
		int i,j;
		String m;
		System.out.println("Enter the elements of matrix:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				m=sc.next();
				num[i][j]=Integer.parseInt(m);
			}
		}
		System.out.println("\t3X3 MATRIX...");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
			
		}
	}
}