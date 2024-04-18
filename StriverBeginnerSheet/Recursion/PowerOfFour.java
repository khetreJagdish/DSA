public class PowerOfFour {
    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false; // Base case: Negative numbers and zero are not powers of four
        }
        if (n == 1) {
            return true; // Base case: 1 is a power of four
        }
        if (n % 4 != 0) {
            return false; // If n is not divisible by 4, it's not a power of four
        }
        return isPowerOfFour(n / 4); // Recursively check if n/4 is a power of four
    }
}