import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int [] arr = {100,50,10,5,2,1};
	    int T =  sc.nextInt();
	    while(T-- >0){
	        int N =  sc.nextInt();
	        int count=0;
	        for(int j:arr){
	            count += N/j;
	            N%=j;
	            if(N==0) break;
	        }
	        System.out.println(count);
	    }
	    
	}
}
