package Assignment1;

import java.util.HashSet;

public class BackTracking {
	
	public HashSet<String> words = new HashSet<>();
	static final int M = 4, N = 4;
	
     void findWordsUtil(char boggle[][], boolean visited[][], int i,int j, String str)
     // A recursive function to add all words present on boggle
    {
        visited[i][j] = true;
        str = str + boggle[i][j];
        
        if(str.length()>2&&(Trie.search(str)||Trie.startsWith(str))) {
        	words.add(str);
        }
 
        // Traverse adjacent cells of boggle[i][j]
        for (int row = i - 1; row <= i + 1 && row < M; row++)
            for (int col = j - 1; col <= j + 1 && col < N; col++)
                if (row >= 0 && col >= 0 && !visited[row][col])
                    findWordsUtil(boggle, visited, row, col, str);
 
        // Erase current character from string and mark visited of current cell as false
        str = "" + str.charAt(str.length() - 1);
        visited[i][j] = false;
    }
 
    
    void findWords(char boggle[][])
    {// Prints all words present in dictionary.
    	
        boolean visited[][] = new boolean[M][N];
        
        String str = "";
        
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                findWordsUtil(boggle, visited, i, j, str);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
