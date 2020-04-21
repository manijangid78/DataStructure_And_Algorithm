// Input : 
// 1 2 3  
// 9 2 3
// 5 3 4

// Output
// 15
// 7
// 10



import java.io.*;
class SumOfColumnElement
{ public static void main(String args[])
   { int a[][]=new int[3][3];
      int b[]=new int[3];
      int s=0,i,j;
      Console con=System.console();
      for(i=0;i<a.length;i++)
      {  for(j=0;j<a[i].length;j++)
          {  a[i][j]=Integer.parseInt(con.readLine());
          }
      }
     System.out.println("Matrix is:");
     for(i=0;i<a.length;i++)
      {  for(j=0,s=0;j<a[i].length;j++)
          { System.out.print(a[i][j]+"  ");
             s=s+a[j][i];
          }
          b[i]=s;
          System.out.println();
      }
    System.out.println("Sum of Rows Element");
    for(i=0;i<b.length;i++)
    {  System.out.println(b[i]);
    }
} 
