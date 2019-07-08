class armstrong1
{ 
   public static void main(String args[])
   {  
	   for(int i=1;i<=1000;i++)
	   { int n=i,s=0,r=0;
         int cp=n;
         while (n>0)
           {
           r=n%10;
           s=s+(r*r*r);
           n=n/10;
           }
         if(cp==s)
	       {
		   System.out.println(s);
	       }
		}
	}	
}