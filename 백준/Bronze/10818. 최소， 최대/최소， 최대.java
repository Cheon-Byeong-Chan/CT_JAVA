import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
		// 	int result = arr[0];
		// 	for(int i =1; i < 5; i++) {
		// 		if(result > arr[i]) {
		// 			result = arr[i];
		// 		}
		// 	}
		//
		// 	int max = arr[0];
		// 	for(int i = 1; i < 5; i++) {
		// 		if (max < arr[i]) {
		// 			max = arr[i];
		// 		}
		// 	}
		// 	System.out.print(result + " ");
		// 	System.out.println(max);
		// }
	}
}