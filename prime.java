// program to check the given number is prime or not


    public class prime
    {
       public static void main(String[]args)
       {
          int n=23,i;
          for(i=2;i<=n/2;i++)
          if(n%i==0)
          {
             System.out.println(n+" is not prime"); 
             break;
          }
          else
          {
             System.out.println(n+" is prime");
             break;
          }
      }
   }


//output:
//23 is prime