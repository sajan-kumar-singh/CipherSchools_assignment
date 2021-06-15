/*Q.3 1. You are given a number n. 
 * 2. You've to create a pattern of * and separated by tab as shown in output format.*/

package Assignment1;
import java.util.*;

public class Assgn2_Pattern {
	void draw(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" \t");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assgn2_Pattern s=new Assgn2_Pattern();
		System.out.println("Enter the number of lines");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		s.draw(n);
		in.close();
	}

}
