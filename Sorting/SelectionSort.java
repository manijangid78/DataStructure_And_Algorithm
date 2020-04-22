//  Input:
//    Enter no of Element : 
//    5
//    Enter elements :
//    1
//    7
//    3
//    5
//    2
//  Outpit:
//    1 2 3 5 7 



import java.io.*;
import java.util.*;

public class SelectionSort{

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

		int max,m;
		for(int i=n-1;i>=0;i--){
			max=0;m=0;
			for(int j=0;j<i;j++){
				
				if(max<arr[j]){
					max=arr[j];					
					m=j;
					
				}
			}
			if(max>arr[i]){
				max=arr[m];
				arr[m]=arr[i];
				arr[i]=max;
			}
		}

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
