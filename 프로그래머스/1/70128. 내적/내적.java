class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int result = 0;
        for(int i = 0; i < a.length; i++) {
            result = a[i] * b[i];
            answer += result;
            result = 0;
        }
        return answer;
    }
}