package com.DSA_Assingment_19Apr_to_23Apr;

import java.util.Arrays;

public class Hw_21_April {
	

	public static void sortSquares(int arr[])
    {
        int n = arr.length;
 
       
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
 
        
        Arrays.sort(arr);
    }
	
	
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
			int i = 0, j = 0, k = 0;


			while (i<n1 && j <n2)
			{

				if (arr1[i] < arr2[j])
					arr3[k++] = arr1[i++];
				else
					arr3[k++] = arr2[j++];
			}

			while (i < n1)
				arr3[k++] = arr1[i++];

			while (j < n2)
				arr3[k++] = arr2[j++];
			}

	public static void main (String[] args)
	
			{
				int[] arr1 = {1, 3, 5, 7};
				int n1 = arr1.length;

				int[] arr2 = {2, 4, 6, 8};
				int n2 = arr2.length;

				int[] arr3 = new int[n1+n2];

				mergeArrays(arr1, arr2, n1, n2, arr3);

				System.out.println("Array after merging");
				for (int i=0; i < n1+n2; i++)
					System.out.print(arr3[i] + " ");
			
	
	
	/*
	LinkedList should be used where modifications to a collection
	are frequent like addition/deletion operations. LinkedList is much 
	faster as compare to ArrayList in such cases. In case of read-only
	collections or collections which are rarely modified, ArrayList is suitable.
	
	*/
	
	
	
	int arr[] = { -6, -3, -1, 2, 4, 5 };
    int n = arr.length;

    System.out.println("Before sort ");
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");

    sortSquares(arr);
    System.out.println("");
    System.out.println("After Sort ");
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
	
	
	}

}
