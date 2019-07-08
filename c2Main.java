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


class c2Main
{
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers:");
		
		abc obj= new abc();
		obj.add(sc.nextInt(),sc.nextInt());
		obj.sub(sc.nextInt(),sc.nextInt());
		obj.mul(sc.nextInt(),sc.nextInt());
		obj.div(sc.nextInt(),sc.nextInt());
	}
}