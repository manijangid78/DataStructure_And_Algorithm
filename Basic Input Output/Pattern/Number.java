// output : 5
//
//  1
//  22  
//  333
//  4444
//  55555
//

class Ptrn1 
{ public static void main(String args[])
   { int no,i,j;
      no=(int)(Math.random()*10);
      System.out.println(no);
      for(i=1;i<=no;i++)
      { for(j=1;j<=i;j++)
         { System.out.print(i);
          }
         System.out.println();
      }
    }
}
