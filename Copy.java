import java.util.Arrays;

public class Copy {
public static void main(String[] args) {
		
		int org[] = {1,2,3};
		
		int arr[] = copyOf(org);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] copyOf(int[] ar) {
		int copyArr[] = Arrays.copyOf(ar, ar.length);
		
		return copyArr;
	}

}
