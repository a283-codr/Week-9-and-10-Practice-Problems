class ASCIIExample {

    public static int getASCII(char ch) {
        int code = (int) ch;
        return code;
    }

    public static void main(String[] args) {
        char character = 'A';
        int asciiValue = getASCII(character);
        System.out.println("ASCII of " + character + " is " + asciiValue);
    }
}