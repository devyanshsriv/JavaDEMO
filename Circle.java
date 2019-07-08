import java.util.Scanner;
class Circle
{ public static void main( String args[])
{ Scanner sc=new Scanner(System.in);
float r, area;
System.out.print("Enter Radius:");
r=sc.nextFloat();
area=(22*r*r)/7;
System.out.println("Area of Circle is "+area);
}
}