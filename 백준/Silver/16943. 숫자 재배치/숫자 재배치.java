
/*
	백준 16943 숫자 재배치
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static String A,B,C;
	static int a,b,c;
	static boolean[] v;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A=st.nextToken();
		B=st.nextToken();
		C="";

		a=Integer.parseInt(A);
		b=Integer.parseInt(B);
		c=-1;

		v = new boolean[A.length()];

		DFS();
		System.out.println(c);

	}

	private static void DFS() {
		if(C.length() == A.length()) {
			if(Integer.parseInt(C) < b)
				c = Math.max(c, Integer.parseInt(C));
			return;
		}

		for(int i = 0; i < A.length(); i++) {
			//A의 각 자리수에 대해 반복문을 실행
			if((C.length() == 0 && A.charAt(i) == '0') || v[i]) continue;
			// 현재 선택할 수 있는 자리수가 '0'이고
			v[i] = true;
			C += A.charAt(i);
			DFS();
			v[i] = false;
			C = C.substring(0, C.length()-1);
		}
	}
}
