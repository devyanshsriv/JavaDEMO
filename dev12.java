import java.util.Scanner;
class dev12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,s=0;
int t=sc.nextInt();
for(i=1;i<=t;i++) 
{
int N=sc.nextInt();
while(N>0)
{
s+=N%10;
N/=10;}
System.out.println(s);s=0;
}}}
 