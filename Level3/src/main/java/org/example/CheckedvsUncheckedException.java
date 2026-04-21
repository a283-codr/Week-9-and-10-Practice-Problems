import java.io.*;

class ExceptionTypesExample {

    public static void readFile() {
        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Checked Exception: File not found");
        }
    }

    public static void main(String[] args) {
        readFile();

        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception: Index out of range");
        }
    }
}