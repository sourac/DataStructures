/*this program has the functionality of finding the number of times 
 * the given sum can be formed in the array through pairing two elements.
 * */

package Arrays;
public class SumArray {
public static void main(String[] args) {
	
	int input[]={1, 5, 7, -1, 5};
	int sum=6;
	pairOfSum(input,sum);
	
}

private static void pairOfSum(int[] input, int sum) {
	int count=0;
	for(int i=0;i<input.length;i++)
	{
		for(int j=i+1;j<input.length;j++){
			if((input[i]+input[j])==sum)
			count++;
		}
	}
	System.out.println("count is : "  + count);
	
}
}

