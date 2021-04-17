
public class Main {
	
	public static int[] mergeSort(int[] array) {
		
		if (array.length > 1) {
			
			// Create two sub partitions:
			int[] s1 = new int[array.length / 2];
			int[] s2 = new int[array.length - s1.length];
			
			// Copy the data in the two sub partitions
			System.arraycopy(array, 0, s1, 0, s1.length);
			
			System.out.println("Copied array s1: ");
			for (int h = 0; h < s1.length; h++) {
				System.out.println(s1[h]);
			}
			
			System.arraycopy(array, s1.length, s2, 0, s2.length);
			
			System.out.println("Copied array s2: ");
			for (int h = 0; h < s2.length; h++) {
				System.out.println(s2[h]);
			}
			
			int[] s1Prime = mergeSort(s1);
			int[] s2Prime = mergeSort(s2);
			
			int[] result = new int[s1Prime.length + s2Prime.length];
			
			// Merge sorted partitions back together

			int i = 0;
			int j = 0;
			int k =0;
			
			while (i < s1Prime.length && j < s2Prime.length) {
				
				if (s1Prime[i] < s2Prime[j]) {
					result[k] = s1Prime[i];
					i++;
				}
				else {
					result[k] = s2Prime[j];
					j++;
				}
				
				k++;
				
			}
			
			while (i < s1Prime.length) {
				result[k] = s1Prime[i];
				k++;
				i++;
			}
			
			while (j < s2Prime.length) {
				result[k] = s2Prime[j];
				k++;
				j++;
			}
			
			System.out.println("Merged s1 and s2: ");
			for (int h = 0; h < result.length; h++) {
				System.out.println(result[h]);
			}
			
			return result;
		}
		
		return array;
		
	}
	

	public static void main(String[] args) {
		
		
		int[] array = {5, 2, 9, 34, 56, 67, 78, 1, 5};
		
		int[] result = mergeSort(array);
		
		System.out.println("Result: ");
		for (int h = 0; h < result.length; h++) {
			System.out.println(result[h]);
		}
	}

}
