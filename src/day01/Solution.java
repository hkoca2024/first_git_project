package day01;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int []  arr={1,2,3,5};

                Arrays.sort(arr);
                int n=arr[arr.length-1];
                int sum=n*(n+1)/2;
                int total=0;
                for(int i=0;i<arr.length;i++){
                    total+=arr[i];
                }
                if(sum==total){
                    System.out.println(n+1);
                }
        System.out.println(sum-total);
            }
        }


