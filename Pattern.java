package Assignment1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		System.out.println("Enter the number of lines you want");
		Scanner s=new Scanner(System.in);
		int lines=s.nextInt();
		System.out.println("Pattern 1");
		for(i=0; i<lines; i++)   
		{   
		for(j=0; j<=i; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println();  
		}
		System.out.print("\n\n");  
		System.out.println("Pattern 2");
		for (i= lines-1; i>=0 ; i--)  
		{  
		for (j=0; j<=i; j++)  
		{   
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
		System.out.print("\n\n");
		System.out.println("Pattern 3");
		for (i= 0; i<= lines-1; i++)  
		{  
		for (j=0; j<=i; j++)   
		{  
		System.out.print("*"+ " ");  
		}   
		System.out.println("");   
		}   
		for (i=lines-1; i>=0; i--)  
		{  
		for(j=0; j <= i-1;j++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println("");  
		}  
		System.out.print("\n\n"); 
		System.out.println("Pattern 4");
		for (i=1; i<=lines; i++)   
		{    
		for (j=lines-i; j>0; j--)         
		{     
		System.out.print("  ");   
		} 
		for (j=1; j<=i; j++ )   
		{    
		System.out.print("* ");   
		}
		System.out.println();   
		}
		System.out.print("\n\n"); 
		System.out.println("Pattern 5");
		for (i=0; i<lines; i++)   
		{    
		for (j=lines-i; j>1; j--)   
		{    
		System.out.print(" ");   
		}    
		for (j=0; j<=i; j++ )   
		{    
		System.out.print("* ");   
		}    
		System.out.println();   
		}
		System.out.print("\n\n"); 
		System.out.println("Pattern 6");
		for(i=0; i<lines; i++)  
		{   
		int number=1;    
		for(j=0; j<=i; j++)  
		{    
		System.out.print(number+ " ");   
		number++;   
		}    
		System.out.println();   
		} 
		System.out.print("\n\n"); 
		System.out.println("Pattern 7");
		int k=1;
		for (i = 1; i <= lines; i++)   
		{  
		for (j = 1; j< i + 1; j++)   
		{   
		System.out.print(k++ + " ");  
		}  
		System.out.println();  
		}  
	}
}
