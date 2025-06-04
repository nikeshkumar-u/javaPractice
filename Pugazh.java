import java.util.Arrays;

class Pugazh 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int insertIndex = 3;  // index where you want to insert the last element
		int lastElement = arr[arr.length - 1];

		// Shift elements from insertIndex to second last one position to the right
		for (int i = arr.length - 2; i >= insertIndex; i--) 
		{
			arr[i + 1] = arr[i];
		}

		// Insert last element at desired position
		arr[insertIndex] = lastElement;

		System.out.println(Arrays.toString(arr));
	}
}
