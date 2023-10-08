package Codes;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,1,2,3};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void insertion(int arr[]){
		// i loop from 0 to n-2 why? because when last but 1 element reached then and j at last
		// then for j=n-1, i will go till i=n-2
		for(int i=0;i<=arr.length-2;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){
					swap(arr,j,j-1);
				}else{
					break;
				}
			}
		}
	}
	static void swap(int arr[],int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
