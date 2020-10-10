package ArrayElement;

import java.util.*;

public class ArrayMax {
	
	public static int largestElement(int myArrayList[], int k)
	{
		Arrays.sort(myArrayList);
		return myArrayList[myArrayList.length-k];
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub;
		int myArrayList[] = {3,2,3,1,2,4,5,5,6};
		System.out.println("The unsorted array is : ");
		for (int i = 0; i<myArrayList.length;i++) 
		{
            System.out.print(+myArrayList[i] + " ");
		}	
		System.out.println('\n');
		int position = 5;
		int maxElement = largestElement(myArrayList, position );
		System.out.println("The "+ position +" largest position in the given array : "+ maxElement);
			
	}

}