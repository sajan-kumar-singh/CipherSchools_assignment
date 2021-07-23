package Assignment1;
import java.io.*;
import java.util.Scanner;
public class CipherSchoolsProject {
	private Node root;//beginning node creation
	CipherSchoolsProject() {
		root=new Node('\0');//beginning node null value declaration
	}
	public void insert(String word) {
		Node curr=root;//pointing curr variable to root
		for(int i=0;i<word.length();i++) {//creation of nodes of trie tree
			char c=word.charAt(i);
			if(curr.children[c-'a']==null) {
				curr.children[c-'a']=new Node(c);
			}
			curr=curr.children[c-'a'];
		}
		curr.isWord=true;//mark end node as true to understand where the word ends
	}
	public boolean search(String word) {
		Node node=getNode(word);//check the value of isWord and return the word is present of not
		return node!=null&&node.isWord;
	}
	public boolean startsWith(String prefix) {
		return getNode(prefix)!=null;//check the curr variable point to null or not and return 
	}
	private Node getNode(String word) {
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(curr.children[c-'a']==null) return null;
			curr=curr.children[c-'a'];
		}
		return curr;//traverse the word for start with and search and return the curr pointer
	}
	class Node{//creation of each node
		public char c;
		public boolean isWord;//mark the ending character to find the word
		public Node[] children;//store all the children character of a node character
		
		Node(char data) {
			this.c=data;
			isWord=false;
			children=new Node[26];
		}
	}
	public static void main(String[] args) throws Exception {
		CipherSchoolsProject p=new CipherSchoolsProject();//object initialization
		System.out.println("Before trie formation......\n\n");
		String[] words= {"sajan","play","zzz","hello","cipherschools"};
		for(int i=0;i<words.length-1;i++) {
			if(p.startsWith(words[i])||p.search(words[i])) {
				System.out.println(words[i]+" is present in trie");
			}
			else {
				System.out.println(words[i]+" is not present in trie");
			}
		}
		System.out.println("\n\nMaking trie of dictionary...\n\n");
		Scanner sc2 = new Scanner(new FileInputStream
	    		  ("E:\\CipherSchools assignment\\src\\Assignment1\\dictionary.txt"));//importing dictionary file in sc2 scanner object
		while(sc2.hasNextLine()) {//checking whether word is present
	         String line = sc2.nextLine();
	         if(p.startsWith(line)||p.search(line)) {
	        	 continue;
	         }
	         else {
	        	 p.insert(line);
	         }
		}
		System.out.println("After trie formation completions......\n\n");
		for(int i=0;i<words.length-1;i++) {
			if(p.startsWith(words[i])||p.search(words[i])) {
				System.out.println(words[i]+" is present in trie");
			}
			else {
				System.out.println(words[i]+" is not present in trie");
			}
		}
	}
}


