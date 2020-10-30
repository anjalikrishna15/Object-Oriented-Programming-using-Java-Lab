// program to find the sum of first n natural numbers


      public class sum
      {
         public static void main(String[]args)
         {
            int n=20,sum=0;
            for (int i=1;i<=n;i++)
                sum+=i;
            System.out.println("sum of first "+n+" natural numbers is "+sum);
         }
      }



//output:
//sum of first 20 natural numbers is 210