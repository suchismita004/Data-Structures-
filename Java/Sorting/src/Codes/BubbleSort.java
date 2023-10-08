package Codes;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void bubble(int []arr){
		int swap=0;
		for(int i=0;i<arr.length;i++){              // 0 to 4
			for(int j=1;j<arr.length-i;j++){        // 1 to 5-i
				if(arr[j]<arr[j-1]){
					//swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap=1;
				}
			}
			if(swap==0){
				break;
			}
		}
	}
}
