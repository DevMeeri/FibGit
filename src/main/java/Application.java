public class Application {
    public int fibonacciNumberAt(int n) {
        if (n <= 2) {
            return n;
        } else {
            return fibonacciNumberAt(n - 1) + fibonacciNumberAt(n - 2);
        }
    }

    public static void main(String... args) {
        Application application = new Application();
        System.out.println(application.fibonacciNumberAt(5));
    }
}