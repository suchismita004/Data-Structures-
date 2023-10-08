package Codes;
import java.util.Arrays;
public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,5,2,1,4};    // array given should be continuous
		cycle(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void cycle(int arr[]){
		int i=0;
		while(i<arr.length){
			int oindex=arr[i]-1;  //original(where the ele should be)
			int index=i;   // index where the element is
			if(arr[index]!=arr[oindex]){
			swap(arr,index,oindex);
			}else{
				i++;
			}
		}
	}
	static void swap(int arr[],int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
