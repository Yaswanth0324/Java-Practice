package helloworld;

import java.util.Scanner;
public class ReArrangeArr
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        reArrangeArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

	}
	public static void reArrangeArray(int[] arr){
	    int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
	}
}