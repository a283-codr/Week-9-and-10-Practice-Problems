class StringArrayExample {

    public static void displayFruits(String[] fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        String[] fruitList = {"Apple", "Banana", "Mango"};
        displayFruits(fruitList);
    }
}