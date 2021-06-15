/*Assignment 2
 * Q.2 Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last 
occurrences of an element x in the given array.*/ 

package Assignment1;

public class Assgn2_Occurrence {
	void position(int[] arr,int x) {
		int first=0,last=arr.length-1;
		while(first<=last) {
			if(arr[first]!=x) {
				first++;
			}
			else if(arr[last]!=x) {
				last--;
			}
			else if(arr[first]==x&&arr[last]==x) {
				break;
			}
		}
		if(first>last) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("First Occurrence = "+first+" Last Occurrence = "+last);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 } ;
		int x=7;
		Assgn2_Occurrence c=new Assgn2_Occurrence();
		c.position(arr,x);
	}

}
