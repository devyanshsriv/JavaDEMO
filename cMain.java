class abc
{
	int a=10,b=5;
	
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
	void mul()
	{
		System.out.println(a*b);
	}
	void div()
	{
		System.out.println(a/b);
	}
}
class cMain
{
	public static void main(String args[])
	{
		abc obj= new abc();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
