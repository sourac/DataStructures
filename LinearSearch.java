package LinearSearching;

public class LinearSearch {
public static void main(String[] args) {
	
	int col[]={10,50,26,0,64,64,67,14,25,4,};
	int searchElement=64;
	int searchResult=linearSearch(col,searchElement);
	System.out.println("element is at the position : " + searchResult);
}

private static int linearSearch(int[] col, int searchElement) {
	int size=col.length;
	for(int i=0;i<col.length;i++){
		if(col[i]==searchElement)
			return i;
	}
	return -1;
	
}
}

