// Input : Hello GitHub
// Output: No of Words=2

import java.io.*;
class NumberOfWords
{ public static void main(String args[])
   {   String str;
        int i,j,p=0,x,y;
        Console con = System.console();
        str=con.readLine();
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        for(i=1;i<arr.length;i++)
        {   if(Character . isWhitespace(arr[i]) && arr[i-1]!=' ')
             {  p++;
             }
        }
        if(arr[arr.length-1]!=' ')
        { p++;
        }
        str=String.copyValueOf(arr);
        System.out.println("No of words "+p);
    }
}
