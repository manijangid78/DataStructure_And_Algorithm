// It contains some basic functions of tree

import java.io.*;
import java.util.*;

public class Tree{
	
	Node node1 = null;
	
	static class Node{
		int value;
		Node left,right;
		Node(int value){
			this.value = value;
				
			left = null;	
			right = null;		
		}
	}		
	
	// --------------------Insertion-----------------------
	
	public void insert(Node node, int value){
		while(1==1){
			if(node.value >= value){
				if(node.left==null){
					Node nod = new Node(value);
					node.left = nod;
					System.out.println("Done Left");
					break;
				}	
				else{
					node = node.left;
				}
			}
			else{
				if(node.right==null){
					Node nod = new Node(value);
					node.right = nod;
					System.out.println("Done Right");
					break;
				}
				else{
					node = node.right;
				}
			}
		}
	}
	
	// -------------------------traverse all nodes ----------------------
	public void treverse(Node node){
		
		if(node.left!=null){
			treverse(node.left);
		}
		System.out.println(node.value);
		if(node.right!=null){
			treverse(node.right);
		}
		
	}
	
	// -------------------Node Search---------------------------------
	public Node search(Node node, int value){
		while(node != null){
			if(node.value>value){
				node = node.left;
			}
			else if(node.value<value){
				node = node.right;
			}
			else if(node.value==value){
				return node;
			}
		}
		return node;
	}
	
	//---------------------- Node Remove Operation ---------------- 
	public Node remove(Node node,int value){
		
		if(node.value > value){
			node.left = remove(node.left,value);
		}
		else if(node.value < value){
			node.right= remove(node.right,value);
		}
		else if(node.value == value){
			if(node.left==null && node.right==null){
			    return node = null;
			}
			else if(node.left==null && node.right!=null){
				return node = node.right;
			}
			else if(node.right==null && node.left!=null){
				return node = node.left;
			}
			
			Node node1 =  min(node.right);
			node.value = node1.value;
			node.right = remove(node.right,node.value);	
		}
		return node;
	}
	
	
	// -----------------Height of tree---------------
	public int height(Node node){
		
		if(node == null){
			return -1;
		}
		int x = height(node.left);
		int y = height(node.right);
		return Math.max(x,y)+1;
	}
	
	// -------------------Maximum Height between Two Nodes-------------------
	public int maxheight(Node node){
		int x = height(node.left);
		int y = height(node.right);
		return x+y+1+2;
	}
	
	
	//--------------------Depth of Tree--------------------
	public int depth(Node node, int value){
		int dpt;
		if(value==node.value||node==null){
			dpt=-1;
		}
		else if(node.value>value){
			dpt = depth(node.left,value);
		}
		else {
			dpt = depth(node.right,value);
		}
		return dpt+1;
	}
	
	// --------------------Minimum Node Value------------
	public Node min(Node node){
		int min = node.value;
		while(node.left!=null){
			node = node.left;
			if(min>node.value){
				min = node.value;
			}
		}
		return node;
	}
	
	// --------------------Maxmum Node Value------------
	public Node max(Node node){
		int max = node.value;
		while(node.right!=null){
			node = node.right;
			if(max<node.value){
				max = node.value;
			}
		}
		return node;
	}
	
	public static void main(String args[]){
		int x=0;
		Node root=null;
		Tree t = new Tree();
		Scanner s = new Scanner(System.in);
		
		while(x!=8){
			System.out.println("1.Enter root\n2.Enter Node\n3.Remove Node\n4.Find Maximum\n5.Find Minimum\n6.Traverse\n7.Searching\n8.Exit\nEnter choice : ");
			x = s.nextInt();
			switch(x){
			
				case 1:{
					System.out.println("Enter root value : ");
					int value = s.nextInt();
					root = new Node(value);
					System.out.println("Root Added !!!\n");
					break;
				}
				case 2:{
					System.out.println("Enter Value for node : ");
					int value = s.nextInt();
					try{
						t.insert(root,value);
						System.out.println("New Node Added !!!\n");
					}catch(Exception e){}
					break;
				}
				case 3:{
					System.out.println("Enter Number for deletion");
					int value = s.nextInt();
					t.remove(root,value);
					System.out.println("Node Deleted !!!\n");
					break;
				}
				case 4:{
					Node nod = t.max(root);
					System.out.println("Maximum value is : "+nod.value+"\n");
					break;
				}
				case 5:{
					Node nod = t.min(root);
					System.out.println("Minimum value is : "+nod.value+"\n");
					break;
				}
				case 6:{
					t.treverse(root);
					break;
				}
				case 7:{
					System.out.println("Enter value : ");
					int value = s.nextInt();
					Node nod = t.search(root,value);
					if(nod == null){
						System.out.println("Element is not found");
					}
					else{
						System.out.println("Element is here");
					}
					break;
				}
				case 8:{
					System.out.println("Bye");
					break;
				}
				default:{
					System.out.println("Wrong Input");
					break;
				}
			}
		}
	}	
}
