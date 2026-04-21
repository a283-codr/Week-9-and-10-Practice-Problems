class ExceptionExample {

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        divideNumbers(10, 0);
    }
}