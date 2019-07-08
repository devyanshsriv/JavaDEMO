class armstrong
{ 
   public static void main(String args[])
   {   int n=157,i,r,s=0;
	   int cp=n;
       cp=n;
       while (n>0)
       {
           r=n%10;
           s=s+(r*r*r);
           n=n/10;
       }
       if(cp==s)
{
       System.out.println("Armstrong Number");
  }
     else
{
       System.out.println("Not Armstrong Number");
  }
}
}