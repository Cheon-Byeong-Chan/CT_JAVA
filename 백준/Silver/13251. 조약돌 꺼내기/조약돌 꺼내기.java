
/*
https://123okk2.tistory.com/407
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // 조약돌의 색상 수
		int [] arr=  new int[M]; // 각 색상별 조약돌 수
		double[] brr = new double[M];
		int N = 0; // 조약돌의 총 개수
		for(int i =0 ; i < M; i++) {
			arr[i] = sc.nextInt();
			N += arr[i];
		}
		int K = sc.nextInt(); // 조약돌을 몇 개 뽑을 지
		double answer = 0;
		for(int i =0 ; i < M; i++) {
			brr[i] = 1;
			for(int j = 0; j < K; j++) {
				brr[i] *= arr[i]-j;
			}
		}
		double eachSum = 0.0;
		for(int i =0; i < M; i++) {
			eachSum += brr[i];
		}
		double totalSum = 1;
		for(int i = 0; i< K; i++) {
			totalSum *= (N-i);
		}
		answer = eachSum / totalSum;
		System.out.println(answer);
	}
}
