
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book element : hashmap.values()) {
            System.out.println(element.toString());
        }

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book element : hashmap.values()) {
            if (element.getName().contains(text)) {
                System.out.println(element.toString());
            }
        }
    }

}
