// output : 5
//
//      *  
//     **
//    ***
//   ****
//  *****

class StarPattern
{ public static void main(String args[])
   { int no,i,j,k=0;
      no=(int)(Math.random()*10);
      System.out.println(no);
      for(i=1;i<=no;System.out.println(),i++)
      { for(k=i;k<no;System.out.print(" "),k++);
         for(j=1;j<=i;System.out.print("*"),j++);
        }
     }
}
 
