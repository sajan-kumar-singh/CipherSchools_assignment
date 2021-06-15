//Assignment - 2
/**Q.1 Given a number x, determine whether the given number is Armstrong number or not. A positive integer of n
digits is called an Armstrong number of order n (order is number of digits) 
if. abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
Input : 1253 Output : No 1253 is not a Armstrong Number 1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
Input : 1634 Output : Yes 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634**/


package Assignment1;
import java.util.*;

public class Assgn2_Armstrong {
	public boolean calarmstrong(int n) {
		int len=length(n),sum=0,x=n;
		for(int i=0;i<len;i++) {
			int r2=n%10;
			sum=(int)(sum+Math.pow(r2, len));
			n=n/10;
		}
		if(x==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	int length(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Assgn2_Armstrong a=new Assgn2_Armstrong();
		if(a.calarmstrong(n)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		s.close();
	}

}
