package Codes;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,2,3,1};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selection(int arr[]){
		for(int i=0;i<arr.length;i++){
			int start=0;
			int last=arr.length-i-1;
			int MaxIndex=max(arr,start,last);
			swap(arr,MaxIndex,last);
			
		}
	}
	static int max(int arr[],int start,int last){
		int max=start;
		for(int i=start;i<=last;i++){
			if(arr[i]>arr[max]){
				max=i;
			}
		}
		return max;
	}
	static void swap(int arr[],int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
