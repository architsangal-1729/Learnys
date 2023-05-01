// question from --> " aiml warmup_01 may.pdf  "    shared by vinod master on 01MAY2023

// string slicing java

// Statement: Read N strings, where N is even. Make a string by joining the first character of the first string and the last character of the last string. 
//            Make another string by combining the first two characters of the second string and the last two characters of the second last string. And so on. Print the strings so formed in the same line, separated by space. Use string slicing.

// Input Format: First line contains the value of N. The next line contains N space-separated

// Output Format: strings. None of the strings contains space. N/2 space-separated strings,

// Sample Input1: 6
//                sach kumar darppean upolip weyrtur noprwfdq

// Sample Output1: sq kuur darlip

import java.util.*;
public class Main{
    public static String merge(String s1 , String s2 , int count){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<count;i++){
            res.append(s1.charAt(i));
        }
        for(int i=s2.length()-count;i<s2.length();i++){
            res.append(s2.charAt(i));
        }
        return res.toString();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String[] arr = new String[n];
	    
	    String[] res = new String[n/2];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.next();
	    }
	    int count=1;
	    for(int i=0;i<n/2;i++){
	        res[i] = merge(arr[i], arr[n-i-1], count);
	        count++;
	    }
	    String ansStr = "";
	    for(int i=0;i<n/2;i++){
	        ansStr += res[i] + " ";
	    }
	    System.out.println(ansStr);
	}
}

/////////////////////////////////////////////////////////// OUTPUT ///////////////////////////////////////////////////////////////////
/*
  6
  sach kumar darppean upolip weyrtur noprwfdq
ouput:--> sq kuur darlip
*/
