package com.DSA_Assingment_19Apr_to_23Apr;

import java.util.Arrays;

public class Hw_20_April {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 4, 1, 6, 8, 2 };

		int start = 0;
		int end = a.length - 1;
		
		mergeSort(a, start, end);
		
		System.out.println(Arrays.toString(a));

	}

	private static void mergeSort(int[] a, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a,start,end,mid);
		}

	}

	private static void merge(int[] a, int start, int end, int mid) {
		
		int i = start;
		int j = mid +1;
		int k = 0;
		
		int b[] = new int[a.length];
		
		while(i<=mid && j<=end)
		{
			if(a[i] <= a[j])
			{
				b[k] = a[i];
				i++;
				k++;
			}
			
			else
			{
				b[k] = a[j];
				k++;
				j++;
			}
		}
			while(i>mid && j<=end)
			{
				b[k] = a[j];
				k++;
				j++;
			}
			
			while(j>end && i<=mid)
			{
				b[k] = a[i];
				k++;
				i++;
			}
						

			for (int m = start; m <= end; m++) {
				a[m] = b[m-start];   
				

			}
		
	}

}
