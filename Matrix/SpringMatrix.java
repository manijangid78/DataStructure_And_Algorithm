import java.util.*;
import java.io.*;

class SpringMatrix {

	public static void main(String args[]){
	
		Scanner st = new  Scanner(System.in);
		int n = st.nextInt();
		int p=0,q=0,r=0,s=0,y=0,x=0,w=0;
		int a[][] = new int[n][n];
		for(int k=1;k<=n*n;){
			
			for(q=0+x;q<n-x;q++){
				a[p][q]=k++;
			}
			x++;
			q--;
			for(r=0+x; r<n-y && k<=n*n ;r++){
				a[r][q]=k++;
			}
			y++;
			r--;
			for(s=n-(x+1); s>=0+w && s<n && k<=n*n ;s--){
				a[r][s]=k++;
			}
			s++;
			w++;
			for(p=n-(x+1);p>=0+x && k<=n*n;p--){
				a[p][s]=k++;
			}
			p++;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
	
	}
}
