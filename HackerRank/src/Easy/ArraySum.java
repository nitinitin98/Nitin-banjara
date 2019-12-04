package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySum {

	static int[] simpleArraySum(int[] ar) {
		int[] a= {4,2,3};
       int max=0;
		for(int c : ar){
			max= c>max?(c>5?8:0):max;
			System.out.println(max);
		}

		return a; 
    }
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,9};
		int[] a=simpleArraySum(arr);
		System.out.println(Arrays.toString(a));
	}
}
