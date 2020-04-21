// Hhistogram 

import java.io.*;
class Hhistogram
{ public static void main(String args[])
   { int a[]=new int[10];
      int i,j,k,x,y;
      Console con=System.console();
      for(i=0;i<a.length;i++)
      {  a[i]=Integer.parseInt(con.readLine());
      }
      for(i=0;i<a.length;i++)
      {  System.out.print(a[i]+" ");
      }
      System.out.println();
      for(i=0;i<a.length;i++)
      {  for(j=0;j<a[i];j++)
             con.printf("*");
          System.out.println();
      }
           
   }
}
