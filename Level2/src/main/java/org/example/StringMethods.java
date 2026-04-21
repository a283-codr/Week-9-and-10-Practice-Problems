class StringMethodsExample {

    public static void processString(String text) {
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Substring: " + text.substring(0, 4));
    }

    public static void main(String[] args) {
        String value = "JavaProgramming";
        processString(value);
    }
}