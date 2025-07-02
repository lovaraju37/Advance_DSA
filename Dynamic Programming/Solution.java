import java.util.* ;

 import java.io.*;

 

public class Solution { 

public static ArrayList<Integer> maximumsumSubarray(int n, int arr[]) {

  // Write your code here

  int sum=0;

  int best=Integer.MIN_VALUE;

  int si=0;

  int ei=0;

  int j=0;

  for (int i=0;i<n;i++) {

   sum += arr[i];

   if (sum>best) {

     best = sum; 

     si=j; 

     ei=i;

   }

   if (sum<0) { 

   sum=0;

    j=i+1;

   } 

 } 

 ArrayList<Integer> array = new ArrayList<>();

  for (int i=si;i<=ei;i++) { 

  array.add(arr[i]); 

 } 

 return array;

 }

 }  