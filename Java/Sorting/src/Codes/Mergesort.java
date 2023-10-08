package Codes;
import java.util.Arrays;
public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		/*
		int ans[]=sort(arr);
		System.out.println(Arrays.toString(arr));  //org.array Notmodified
		System.out.println(Arrays.toString(ans));	//to check the above code done this
		*/
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] sort(int arr[]){
		if (arr.length==1){
			return arr;
		}
		int mid=arr.length/2;
		
		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right= sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
				
	}
	static int[] merge(int first[], int last[]) {
		// TODO Auto-generated method stub
		int mix[]=new int[first.length+last.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i< first.length && j<last.length){
			
			if(first[i]<last[j]){
				mix[k]=first[i];
				i++;
			}else{
				mix[k]=last[j];
				j++;
			}
			k++;
		}
		while(i<first.length){
			mix[k]=first[i];
			i++;
			k++;
		}
		while  (j<last.length){
			mix[k]=last[j];
			j++;
			k++;
		}
		return mix;
	}

}
