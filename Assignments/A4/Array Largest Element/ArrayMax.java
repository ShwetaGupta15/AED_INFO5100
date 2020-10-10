package ArrayElement;

import java.util.*;

public class ArrayMax {
	
	public static int largestElement(int arrayList[], int k)
	{
		Arrays.sort(arrayList);
		return arrayList[arrayList.length-k];
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub;
		int arrayList[] = {3,2,3,1,2,4,5,5,6};
		System.out.println("The unsorted array is : ");
		for (int i = 0; i<arrayList.length;i++) 
		{
            System.out.print(+arrayList[i] + " ");
		}	
		System.out.println('\n');
		int position = 5;
		int maxElement = largestElement(arrayList, position );
		System.out.println("The "+ position +" largest position in the given array : "+ maxElement);
			
	}

}