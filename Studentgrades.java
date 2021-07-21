/**
 * 
 */
package practice;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * @author lipsa
 *
 */
public class Studentgrades {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		public static void grades(int a,int b,int c,int d,int e)
		{
	    
	      // Your code here
	 
	if((a >= 1 || a <= 100) &&(b >= 1 ||b <= 100) &&(c >= 1 || c <= 100) && (d >= 1 || d <= 100) &&(e >= 1 || e <= 100) )
	{
	int marks = a+b+c+d+e;
	      double per;
	      per=marks/5;
	  
	      if(per >= 80 )
	      System.out.println("A");
	      else if(per < 80 && per >= 60 )
	    	  System.out.println("B");
	    else if (per < 60 && per >=40)
	    	System.out.println("C");
	      else
	    	  System.out.println( "D");
	}
	  else
		  System.out.println( "F");
	     }
		
		public static void main(String args[])
		{
				Scanner sc= new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				int e=sc.nextInt();
				grades(a,b,c,d,e);
				}
}

