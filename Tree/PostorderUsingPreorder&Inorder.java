// Input :
// Enter Preorder : 1 2 4 5 3
// Enter Inorder : 4 2 5 1 3
//
// Output:
// Postorder : 4 5 2 3 1

import java.io.*;
import java.util.*;
class InPreOrder{
	
	static class Node{
		Node left,right;
		int value;
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	public static void main(String args[]){
		
		InPreOrder ip = new InPreOrder();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Preorder : ");
		String str1[] = s.nextLine().split(" ");
		System.out.print("Enter Inorder : ");
		String str2[] = s.nextLine().split(" ");
		
		int pre[] = new int[str1.length];
		int in[] = new int[str2.length];
		
		for(int i=0;i<pre.length;i++){
			pre[i] = Integer.parseInt(str1[i]);
			in[i] = Integer.parseInt(str2[i]);			
		}
		
		
		Node root = ip.binaryTree(pre,in,0,pre.length-1);
		
		System.out.println();
		System.out.print("Postorder : ");
		ip.treverse(root);
		
	}
	
	public void treverse(Node node){
		
		if(node.left!=null){
			treverse(node.left);
		}
		
		if(node.right!=null){
			treverse(node.right);
		}
		System.out.print(node.value +" ");
		
	}
	static int x=-1;
	public static Node binaryTree(int pre[],int in[],int l, int h){
		int i;
		x++;
		for(i=l;i<=h;i++){
			if(pre[x] == in[i]){
				break;
			}
		}	
		if(i>h){
			i--;
		}
		if(l==h){
			Node node = new Node(in[i]);
			return node;
		}
		Node node = new Node(in[i]);
		node.left = binaryTree(pre,in,l,i-1);
		node.right =binaryTree(pre,in,i+1,h);
		return node;
	}		
}
