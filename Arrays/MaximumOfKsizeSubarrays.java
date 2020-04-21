// for more about question : hackerearth.com/practice/data-structures/arrays/1-d/
//                           practice-problems/algorithm/maximum-of-k-size-subarrays-deque/


import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max;
        int k = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= s.nextInt();
        }
        for(int i=0;i<n-k+1;i++){
            max = a[i];
            for(int j=i+1;j<i+k;j++){
                if(max<a[j]){
                    max = a[j]; 
                } 
            }
            System.out.print(max+" ");
        }
    }
}
