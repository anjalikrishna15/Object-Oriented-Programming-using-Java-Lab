// program to find the factors of a given number


     public class factors
     {
        public static void main(String[]args)
        {
           int n=32;
           System.out.println("The factors of "+n+" are:");
           for (int i=1;i<=n;i++)
           { 
               if(n%i==0)
               System.out.println(i);
           }
        }
     }


//output:
/*The factors of 32 are:
1
2
4
8
16
32*/