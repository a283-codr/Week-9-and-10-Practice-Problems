import java.util.Scanner;

class StringInputExample {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        String name = getInput();
        System.out.println("Welcome " + name);
    }
}