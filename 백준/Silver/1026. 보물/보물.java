import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] brr = new int[N];
        int result = 0;
        for(int i =0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i < N; i++) {
            brr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < N; i++) {
            result += arr[i] * brr[N-1-i];
        }

        System.out.println(result);
    }
}