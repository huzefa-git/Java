import java.util.ArrayList;
import java.util.List;

public class StringToListExample {
    public static void main(String[] args) {
        String myString = "Huzefa mohammed";
        List<Character> charList = new ArrayList<>();

        // Convert string to list of characters
        for (char c : myString.toCharArray()) {
            charList.add(c);
        }
        // Print the list of characters
        System.out.println(charList,end =" ");
    }
}