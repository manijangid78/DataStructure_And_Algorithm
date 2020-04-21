// Multiplication of matrix

import java.io.*;
class MultiOfMatrix
{ 
  public static void main(String args[])
    { int a[][]=new int[3][3];
      int b[][]=new int[3][3];
      int c[][]=new int[3][3];
      int i,j,k,s=0;
      Console con=System.console();
      con.printf("Enter element of first Matrix:\n");
      for(i=0;i<a.length;i++)
      {  for(j=0;j<a[i].length;j++)
          {  a[i][j]=Integer.parseInt(con.readLine());
          }
      }
      con.printf("Enter element of second Matrix:\n");
      for(i=0;i<b.length;i++)
      {  for(j=0;j<b[i].length;j++)
          {  b[i][j]=Integer.parseInt(con.readLine());
          }
      }
     
     System.out.println("Multiplied Matrix is:");
     
     for(i=0;i<c.length;i++)
     {   for(j=0;j<c.length;j++)
         {    for(k=0,s=0;k<c.length;k++)
               { s+=a[i][k]*b[k][j];
               }
               c[i][j]=s;   
               System.out.print(c[i][j]+"  ");
         }
         System.out.println();
     }
   }
}
