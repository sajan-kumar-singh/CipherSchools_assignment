/*Q.4 1. You've to print all prime numbers between a range. 
 * 2. Take as input "low", the lower limit of range.
 *  3. Take as input "high", the higher limit of range. 
 *  4. For the range print all the primes numbers between low and high (both included).
*/

package Assignment1;
import java.util.*;
public class Assgn2_Prime {
	void findprime(int l,int u) {
		int i=l;
		while(i<=u) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag!=1) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the lower and upper limit");
		Scanner in =new Scanner(System.in);
		int lower=in.nextInt();
		int upper=in.nextInt();
		Assgn2_Prime s=new Assgn2_Prime();
		s.findprime(lower, upper);
		in.close();
	}

}
