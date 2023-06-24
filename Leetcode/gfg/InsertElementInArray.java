package com.gfg;

public class InsertElementInArray {
	
	static int insert(int arr[], int size, int element, int capacity, int pos)
    {
    	if(size == capacity)
    		return size;

    	int idx = pos - 1;

    	for(int i = size - 1; i >= idx; i--)
    	{
    		arr[i + 1] = arr[i];
    	}

    	arr[idx] = element;

    	return size + 1;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = new int[5], capacity = 5, size = 3;

       arr[0] = 5; arr[1] = 10; arr[2] = 20;

       System.out.println("Before Insertion");

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       int element = 7, pos = 2;

       size = insert(arr, size, element, capacity, pos);

       System.out.println("After Insertion");

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}
