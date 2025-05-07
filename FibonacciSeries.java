public class FibonacciSeries {

    // Method to generate Fibonacci series
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print Fibonacci series up to n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println(); // Newline for better readability
    }

    public static void main(String[] args) {
        // Example usage - Generate Fibonacci series for 10 terms
        generateFibonacci(10); // Feel free to change the number of terms
    }
}
