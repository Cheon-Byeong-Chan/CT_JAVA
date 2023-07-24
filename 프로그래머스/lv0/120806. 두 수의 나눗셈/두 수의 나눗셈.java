// class Solution {
//     public int solution(int num1, int num2) {
//         double answer = 0;
//         answer = (double)num1 / num2 * 1000;
//         int result = (int)answer;
//         return result;
//     }
// }
class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        return (int) (result * 1000);
    }
}