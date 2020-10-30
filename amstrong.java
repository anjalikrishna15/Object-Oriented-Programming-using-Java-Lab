// program to check the given number is amstrong or not


   public class amstrong
   {
    public static void main(String[]args)
    {
       int n=407,org,r,result=0;
       org=n;
       while(n!=0)
       {
          r=n%10;
          result+=Math.pow(r,3);
          n=n/10;
       }
       if(org==result)
          System.out.println(org+" is amstrong number");
       else
          System.out.println(org+" is not an amstrong number");
   }
  }


//output:
//407 is amstrong number