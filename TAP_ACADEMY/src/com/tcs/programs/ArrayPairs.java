package com.tcs.programs;

import java.util.*;

public class ArrayPairs {

    public static void printPairs(int[] arr, int num){

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == num){
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            }
            else if(sum < num){
                left++;
            }
            else{
                right--;
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printPairs(arr, target);
    }
}