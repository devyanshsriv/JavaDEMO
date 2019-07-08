import java.util.Scanner;
class abc
{
	
	
	void add(int a,int b)
	{
		System.out.println("Sum:"+ (a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtract:"+ (a-b));
	}
	void mul(int a,int b)
	{
		System.out.println("Multiply:"+ (a*b));
	}
	void div(int a,int b)
	{
		System.out.println("Divide:"+ (a/b));
	}
}


class c1Main
{
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		abc obj= new abc();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.div(a,b);
	}
}
