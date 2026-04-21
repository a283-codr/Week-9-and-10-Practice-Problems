class CreateStringExample {

    public static String createMessage(String name) {
        String message = "Hello, " + name;
        return message;
    }

    public static void main(String[] args) {
        String userName = "Abhinav";
        String result = createMessage(userName);
        System.out.println(result);
    }
}