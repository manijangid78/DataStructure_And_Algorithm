
import java.io.*;
import java.util.*;

class Graph{

	// main function
	
	public static void main(String args[]){
		
		HashMap map = new HashMap();
		
		map = insertVertex(map,"A");
		map = insertVertex(map,"B");
		map = insertVertex(map,"C");
		map = insertVertex(map,"D");
		map = insertVertex(map,"E");
		map = insertEdge(map,"A","B");
		map = insertEdge(map,"A","C");
		map = insertEdge(map,"A","E");
		map = insertEdge(map,"E","B");
		map = insertEdge(map,"C","B");
		map = insertEdge(map,"D","B");
		map = insertEdge(map,"D","C");
		
    // calling different functions 
    
		ArrayList arr =(ArrayList) map.get("A");
		System.out.println(arr.toString());
		arr =(ArrayList) map.get("B");
		System.out.println(arr.toString());
		arr =(ArrayList) map.get("C");
		System.out.println(arr.toString());
		arr =(ArrayList) map.get("D");
		System.out.println(arr.toString());
		arr =(ArrayList) map.get("E");
		System.out.println(arr.toString());
	
		ArrayList arr2 = new ArrayList();
		arr2 = DFS_Traversal(map,arr2,"D");
		System.out.println(arr2.toString());
	
		ArrayList arr3 = new ArrayList();
		arr3 = BFS_Traversal(map,arr3,"D");
		
		ArrayList<Integer> arr4 = new ArrayList<Integer>();
		recursiveDFS(map,arr4,"D");
		System.out.println(arr4.toString());
	}
	
	// ************************...........................function to insert node in hashMap........!!!!!!!!!!!!!!!!!!!!!!!################################
	
	public static HashMap insertVertex(HashMap map, String str){
		
		if(!map.containsKey(str)){
			map.put(str,new ArrayList<String>());
		}
		else{
			System.out.println("Contains Same Node	!!!!!	Try Again	!!!");	
		}
		return map;
	}
	
	// *****************...................................function to insert edge ................!!!!!!!!!!!!!!!!!!!!!!!**************************************
	
	public static HashMap insertEdge(HashMap map,String start,String end){
		if(map.containsKey(start) && map.containsKey(end)){
			ArrayList arr1 = (ArrayList)map.get(start);
			ArrayList arr2 = (ArrayList)map.get(end);
			
			arr1.add(end);
			arr2.add(start);
			
			map.put(start,arr1);
			map.put(end,arr2);
			
		}
		else{
			System.out.println("Vertext not found");
		}
		return map;
	}
	
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!..........................Function to deleteNode...................!!!!!!!!!!!!!!!!!!!!!!!!!!!!***************************
	
	public static HashMap deleteNode(HashMap map,String str){
		
		if(map.containsKey(str)){
			
			ArrayList arr = (ArrayList)map.get(str);
			for(int i=0;i<arr.size();i++){
				map = deleteNodeEdge(map,str,(String)arr.get(i));
			}
			map.remove(str);
		}
		else{
			System.out.println("Not contains vertax");
		}	
		return map;
	}
	
	public static HashMap deleteNodeEdge(HashMap map,String start,String end){
		
		if(map.containsKey(start) && map.containsKey(end)){
			ArrayList arr2 = (ArrayList)map.get(end);
			try{
				arr2.remove(start);
			}catch(Exception e){}
			map.put(end,arr2);
		}
		else{
			System.out.println("Vertex Not Found");
		}
		return map;
	}
	
	// **************************............................!Function to deleteEdge!................................!!!!!!!!!!!!!!!!!!!!!!!!!!*****************
	
		public static HashMap deleteEdge(HashMap map,String start,String end){
		
			if(map.containsKey(start) && map.containsKey(end)){
				ArrayList arr1 = (ArrayList)map.get(start);
				try{
					arr1.remove(end);
				}catch(Exception e){}
			
				map.put(start,arr1);
				ArrayList arr2 = (ArrayList)map.get(end);
				try{
					arr2.remove(start);
				}catch(Exception e){}
				map.put(end,arr2);
			}
			else{
				System.out.println("Vertex Not Found");
			}
			return map;
		}		
	
	//######################DFS traverse with looping_methods ################################
	
		public static ArrayList DFS_Traversal(HashMap hashMap,ArrayList<String> arr,String root){

			Stack<String> stack = new Stack<String>();
			stack.push(root);
			arr.add(root);
	
			while(!stack.empty()){
				ArrayList<String> arrayList = (ArrayList)hashMap.get(root);
				int i=0;
				while(i<arrayList.size()){
					if(!arr.contains(arrayList.get(i))){
						stack.push(arrayList.get(i));
						arr.add(arrayList.get(i));
						root = arrayList.get(i);
						break;
					}
					i++;
				}
				if(i==arrayList.size()){
					root= stack.pop();
				}
			}
			return arr;
		}
	
	//######################DFS traverse with recursive_method ################################
	
		public static void recursiveDFS(HashMap hashMap, ArrayList arr,String root){
			arr.add(root);
			ArrayList temp = (ArrayList)hashMap.get(root);
			for(int i=0;i<temp.size();i++){
				if(!arr.contains(temp.get(i))){
					System.out.println(temp.get(i));
					recursiveDFS(hashMap,arr,(String)temp.get(i));
				}
			}
		}
	
	//######################BFS traverse with looping_methods ################################
	
		public static ArrayList BFS_Traversal(HashMap hashMap,ArrayList<String> arr,String root){
		
			Queue<String> queue = new LinkedList<String>();
			queue.add(root);
			arr.add(root);
		
			while(!queue.isEmpty()){
				root = queue.remove();
				ArrayList<String> arrayList = (ArrayList)hashMap.get(root);
				int i=0;
				while(i<arrayList.size()){
					if(!arr.contains(arrayList.get(i))){
						queue.add(arrayList.get(i));
						arr.add(arrayList.get(i));
					}
					i++;
				}
			}	
			System.out.println(arr.toString());
			return arr;
		}
}
