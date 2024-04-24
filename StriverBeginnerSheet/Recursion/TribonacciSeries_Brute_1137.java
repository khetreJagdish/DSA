public class TribonacciSeries_Brute_1137 {
    public static int tribonacci(int n) {
        if(n <= 0) return 0;
        if(n == 1 || n== 2) return 1;

        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }

    public static void main(String[] args){
        System.out.println(tribonacci(15));
    }
}