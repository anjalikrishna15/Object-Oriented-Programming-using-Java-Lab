// program to print factorial of first n numbers number


    public class factorial
    {
      public static void main(String args[])
      {
         int n=10,i;
         for( i=1;i<=n;i++)
         { 
           int t=i;
           int fact=1;
           while(t>0)
          { 
            fact=fact*t;
            t--;
          }
         System.out.println("factorial of " +i+ "  is:"+fact);
         }
      }
    }
   

//  output:
/*factorial of 1  is:1
  factorial of 2  is:2
  factorial of 3  is:6
  factorial of 4  is:24
  factorial of 5  is:120
  factorial of 6  is:720
  factorial of 7  is:5040
  factorial of 8  is:40320
  factorial of 9  is:362880
  factorial of 10  is:3628800*/
