/*Q.5 1. You are given a string that contains only lowercase and uppercase alphabets. 
 * 2. You have to toggle the case of every character of the given string.*/

package Assignment1;
import java.util.*;
public class Assgn2_String {
	void changecase(String s) {
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(c>='a'&&c<='z') {
				c=(char) (c-32);
				System.out.print(c);
			}
			else if(c>='A'&&c<='Z') {
				c=(char) (c+32);
				System.out.print(c);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		in.close();
		Assgn2_String c=new Assgn2_String();
		c.changecase(s);

	}

}
