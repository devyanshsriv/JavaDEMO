import java.util.Scanner;
class Number
{ public static void main( String args[])
{ Scanner sc=new Scanner(System.in);
System.out.print("Enter the Number:");
int a=sc.nextInt();
if(a>0)
{ System.out.println("Number is Positive");
}
else if (a<0)
{ System.out.println("Number is Negative");
}
else
{ System.out.println("Number is Zero");
}
}
}