// Input :
// Enter number for first tree :
// 1 2 3 4 5
// Enter number for secound tree :
// 1 3 5 7 9
//
// Output :
// Inodrder Traverse:
// 3 1 1 2 3 5 4 5 7 9
// 

import java.io.*;
import java.util.*;

class MargeTree{
	
	static public class Node{
		Node left,right;
		int value;
		Node(int value){
			this.value=value;
			left=null;
			right=null;
		}
	}
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		
		System.out.println("Enter number for first tree :");
		String str1[] = s.nextLine().split(" ");
		System.out.println("Enter number for secound tree :");
		String str2[] = s.nextLine().split(" ");
		for(int i =0;i<str1.length;i++){
			arr1.add(i,Integer.parseInt(str1[i]));
		}
		for(int i =0;i<str1.length;i++){
			arr2.add(i,Integer.parseInt(str2[i]));
		}
		
		Collections.sort(arr1);
		Collections.sort(arr2);
	
		Node root1 = createTree(arr1,0,arr1.size()-1);
		Node root2 = createTree(arr2,0,arr1.size()-1);
		
		arr1 = traverse(root1,new ArrayList());
		arr2 = traverse(root2,new ArrayList());
		
		for(int i=0;i<arr2.size();i++){
			arr1.add(arr2.get(i));
		}
		Collections.sort(arr1);
		Node root = createTree(arr1,0,arr1.size()-1);
		traverse(root);
		traverse(root,0);
		
	}
	
	public static Node createTree(ArrayList<Integer> arr,int l,int h){
		
		if(l>h){
			return null;
		}
		int mid = (l+h)/2;	
		Node node = new Node(arr.get(mid));
		node.left = createTree(arr,l,mid-1);
		node.right = createTree(arr,mid+1,h);
		return node;
		
	}
	
	public static ArrayList<Integer> traverse(Node node,ArrayList arr){
		if(node==null){
			return arr;
		}
		traverse(node.left,arr);
		arr.add(node.value);
		traverse(node.right,arr);
		return arr;
	}
	
	public static int traverse(Node node){
		if(node==null){
			return 1;
		}
		System.out.println(node.value);
		traverse(node.left);
		traverse(node.right);
		return 1;
	}
	public static int traverse(Node node,int sp){
		
		if(node==null){
			return 1;
		}
		sp+=10;
		if(node.left!=null){
			traverse(node.left,sp);
		}
		System.out.println();
		for(int i=10;i<sp+10;i++){
			System.out.print(" ");
		}
		System.out.print(node.value);
		
		if(node.right!=null){
			traverse(node.right,sp);
		}
		return 1;
	}
}
