// Input : Hello          World    Mani   !!!!
// OutPut: Hello World Mani !!!

import java.io.*;
class RemoveSpaces
{ public static void main(String args[])
   {   String str;
        int i,j,p=0,x=0,y;
        Console con = System.console();
        str=con.readLine();
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        for(i=1;i<arr.length-x;i++)
        {   if(Character.isWhitespace(arr[i]) && Character.isWhitespace(arr[i-1])||Character . isWhitespace(arr[0]))
             {  for(j=i;j<arr.length-x-1;j++)
                 { arr[j-1]=arr[j];
                 }
                 i--;
                 x++;
             }
        }
        str=String.copyValueOf(arr);
        str=str.substring(0,arr.length-x);
        System.out.print(str);
    }
}
