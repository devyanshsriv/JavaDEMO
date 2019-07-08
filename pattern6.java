class pattern6
{ public static void main (String args[])
	{
  int j,k,i;
  {for(i=1;i<=5;i++)
   { for (k=1;k<=i-1;k++)
    { System.out.print("*");
	}
	for (j=5;j>=i;j--)
	{ System.out.print(j);
	}
   System.out.println();
  }
 }
}
}