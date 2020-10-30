// program to check given number is palindrome or not

    public class palindrome
    {
      public static void main(String args[])
      {
         int n=1221,r,rev=0,org;
         org=n;
         while(n>0)
         { 
            r=n%10;
            rev=rev*10+r;
            n=n/10;
         }
         if(org==rev) 
            System.out.println(org+" is a palindrome number");
         else
            System.out.println(org+" is not a palindrome number");
       }
    }

  
//  output:
//  1221 is a palindrome number
     