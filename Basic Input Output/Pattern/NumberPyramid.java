// Output:
// 3
//   1
//  121
// 12321

class NumberPyramid 
{ public static void main(String args[])
   { int no,i,j,k;
      no=(int)(Math.random()*10);
      System.out.println(no);
      for(i=1;i<=no;System.out.println(),i++)
      { for(j=i;j<no;System.out.print(" "),j++);
         for(k=1;k<=i;System.out.print(k),k++);
         for(j=i-1;j>0;System.out.print(j),j--); 
       }
    }
}
