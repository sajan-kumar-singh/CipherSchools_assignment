package Assignment1;

public class Trie {
	
	class Node{//Structure of each node
		public char c;
		public boolean isWord;//mark the ending character to find the word
		public Node[] children;//store all the children character of a node character
		
		Node(char data) {
			this.c=data;
			isWord=false;
			children=new Node[26];
		}
	}
	
	
	public static  Node root;//Root node of Trie
	
	
	Trie() {
		root=new Node('\0');//beginning node blank value declaration
	}
	
	
	public void insert(String word) {//Function for Trie creation
		Node curr=root;
		for(int i=0;i<word.length();i++) {//creation of nodes of trie tree
			char c=word.charAt(i);
			if(curr.children[c-'a']==null) {
				curr.children[c-'a']=new Node(c);
			}
			curr=curr.children[c-'a'];
		}
		curr.isWord=true;//mark end node as true to understand where the word ends
	}
	
	
	public static  boolean search(String word) {
		Node node=getNode(word);//check the word till the end
		return node!=null&&node.isWord;
	}
	
	
	public static boolean startsWith(String prefix) {
		return getNode(prefix)!=null;//check the word upto certain point
	}
	
	
	public static  Node getNode(String word) {
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(curr.children[c-'a']==null) return null;
			curr=curr.children[c-'a'];
		}
		return curr;//Common funtion for startWith and search functions to find word in Trie
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
