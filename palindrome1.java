class palindrome1
{ 
   public static void main(String args[])
   {   
       for (int i=1;i<1000;i++)
       {
       int num=i,r,rev=0,ori;
       ori=num;
       while (num>0)
         {
           r=num%10;
           rev=(rev*10)+r;
           num=num/10;
         }
       if(ori==rev)
         { System.out.println(rev);
	       
	     }
		}
    }
}