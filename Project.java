package Assignment1;

import java.io.FileInputStream;
import java.util.*;

public class Project {
    
	public static void main(String[] args) throws Exception {
		
		Trie t=new Trie();
		BackTracking trav=new BackTracking();
		
		char characters[][] = { { 'g', 'i', 'z','m' },
                { 'u', 'e', 'k', 'a' },
                { 'q', 's', 'e', 'o' }, 
                { 'f', 'd', 'p', 'l' }};
		
		
		Scanner sc2 = new Scanner(new FileInputStream
	    		  ("E:\\CipherSchools assignment\\src\\Assignment1\\dictionary.txt"));//importing dictionary file in sc2 scanner object
		while(sc2.hasNextLine()) {//checking whether word is present
	         String line = sc2.nextLine();
	         if(Trie.startsWith(line)||Trie.search(line)) {
	        	 continue;
	         }
	         else {
	        	 t.insert(line);
	         }
		}
		trav.findWords(characters);
		
		System.out.println("Valid words are");
        Iterator<String> i = trav.words.iterator();
        while (i.hasNext())
            System.out.println(i.next());
	}
}


