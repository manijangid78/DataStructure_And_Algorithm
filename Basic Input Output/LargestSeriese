// Find largest series in a number of series in incresing order without loop

class Serise 
{ public static void main(String args[])
   {  int i,p=1,j=1,max=0,k=0;
       for(i=1;i<=10;i++)
       {  int no=(int)(Math.random()*100);
           System.out.print(no+" ");
            if(i==1)
                max=no;
            else if(no<max)
            { max=no;
               k= j>k ? j:k ;
               j=1;
               p++;
             }
             else
             { max=no; 
                 j++;
             }
         }
        System.out.print("\nTotel serise are :"+p+"\nLargest serise's length is :"+k);
     }
}
