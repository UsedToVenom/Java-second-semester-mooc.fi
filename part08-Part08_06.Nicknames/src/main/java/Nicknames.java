
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> someMap = new HashMap();
        someMap.put("Mathew", "Matt");
        someMap.put("Michael", "Mix");
        someMap.put("Arthur", "Artie");
        System.out.println(someMap.get("Mathew"));
    }

}
