// program to print fibonacci series 


    public class fibonacci
   {
      public static void main(String[]args)
      {
        int n=10;
        int t1=0;
        int t2=1;
        System.out.println("fibonacci series:");
        System.out.println(t1+"\n"+t2);
        for(int i=2;i<n;i++)
        { 
           int t3=t1+t2;
           System.out.println(t3);
           t1=t2;
           t2=t3;
        }
     }
   }
 

   //output:
  /*fibonacci series:
    0
    1
    1
    2
    3
    5
    8
   13
   21
   34*/