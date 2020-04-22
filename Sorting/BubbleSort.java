// Input:
//    Enter no of Element : 
//    5           
//    Enter elements :
//    8
//    4
//    7
//    1
//    4
//Output:
//    1 4 4 7 8


import java.io.*;
import java.util.*;

public class BubbleSort{

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Element : ");
		int n = s.nextInt();
		int t;
		int arr[] = new int[n];

		System.out.println("Enter elements :");

		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]<arr[j]){
					t= arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
