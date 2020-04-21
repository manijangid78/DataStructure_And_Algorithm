// Ex. aba
// String is palindrome
// Ex. abaa
// String is not palindrome


import java.io.*;
class StringPlaindrom
{ public static void main(String args[])
   {   String str;
        int i,j;
        Console con = System.console();
        str=con.readLine();
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        for(i=0,j=arr.length-1;i<arr.length;i++)
        {   if(arr[i]!=arr[j])
             {   System.out.println("String is not palindrom");
                  break;
              }
             else
             {   if(i>=j)
                 { System.out.println("String is Plaindrom");
                    break;
                  }
                  j--;
             }
         }
    }
}
