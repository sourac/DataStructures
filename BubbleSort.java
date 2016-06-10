/*
	Bubble sort, also referred to as sinking sort, is a simple sorting algorithm
	that works by repeatedly stepping through the list to be sorted, 
	comparing each pair of adjacent items and swapping them if they are in the
	wrong order. The pass through the list is repeated until no swaps
	are needed, which indicates that the list is sorted. 
	The algorithm gets its name from the way smaller elements "bubble" 
	to the top of the list. Because it only uses comparisons to operate on elements, 
	it is a comparison sort. Although the algorithm is simple, most of the other 
	sorting algorithms are more efficient for large lists.*/

public class BubbleSort {
	
public static void main(String[] args) {
	
	int array[]={20,1,23,5,78,264,12,65,45,16,23};
	bubbleSort(array);
	
}

private static void bubbleSort(int[] array) {
	
int temp;	
int n=array.length;
for(int i=0;i<n-1;i++){
	for(int j=1;j<n-i;j++){
	
		if(array[j-1]< array[j]){
			temp=array[j-1];
			array[j-1]=array[j];
			array[j]=temp;
			
		}
		
	}
}

printNumber(array);
	
}

private static void printNumber(int[] array) {
	for(int i=0;i<array.length;i++){
	System.out.print(array[i] + " ");
	}
	
}
}
