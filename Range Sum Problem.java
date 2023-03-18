/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int q = sc.nextInt(); 
	    int [] arr = new int [n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int pfs[] = new int[n+1];
	    Arrays.fill(pfs,0);
	    for(int i=1;i<n+1;i++){
	        pfs[i] = pfs[i-1] + arr[i-1];
	    }
	    while(q-->0){
	        int l = sc.nextInt();
	        int r = sc.nextInt();
	        System.out.println(pfs[r]-pfs[l-1]);
	    }
	}
}
