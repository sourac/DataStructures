package BinarySearching;

public class BinarySearch {
public static void main(String[] args) {
	
	int testArray[] ={2,4,6,8,10,12,14,16,18,20};
	int searchNumber=12;
	int requiredNumber=binarySearch(testArray,searchNumber);
	System.out.println("the required number is on the position : " + requiredNumber);
}

private static int binarySearch(int[] testArray, int searchNumber) {
	
	int begin=0;
	int end=testArray.length-1;
	while(begin<=end){
	int mid=(begin+end)/2;
	
	if(searchNumber==testArray[mid]){
		return mid;
	}
	if(searchNumber<testArray[mid]){
		end=mid-1;
	}
	else{
		begin=mid+1;
	}
	}
	return -1;
	
}
}

