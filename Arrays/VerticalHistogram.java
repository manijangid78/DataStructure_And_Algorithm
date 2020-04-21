// 3 4 1 7 8 2 4 1 4 6 
// ***
// ****
// *
// *******
// ********
// **
// ****
// *
// ****
// *****

import java.io.*;
class Vhistogram
{ public static void main(String args[])
   { int a[]=new int[10];
      int i,j,k,x,y;
      Console con=System.console();
      for(i=0;i<a.length; a[i]=(int)(Math.random()*10),i++);
     for(i=0;i<a.length;System.out.print(a[i]+" "),i++);
     System.out.println();
     for(i=a.length;i>0;i--)
     {   for(j=0;j<a.length;System.out.println(),j++) 
           {   if(a[j]==i)
               {   System.out.print("* ");
                    a[j]--;
               } 
               else
               { System.out.print("  ");
               }         
            }
    }
}
